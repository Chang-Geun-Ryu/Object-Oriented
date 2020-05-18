package academy.pocu.comp2500.assignment1;

import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.time.temporal.ChronoField;

public final class BlogHost {
    private final HashMap<String, ArrayList<Content>> mapContents;
    private final ArrayList<String> tags;
    private final ArrayList<String> authors;
    private SortType sortType;

    public enum SortType {
        DESCENDINGPOST,
        ASCENDINGPOST,
        DESCENDINGMODIFY,
        ASCENDINGMODIFY,
        ASCENDINGTITLE
    }

    public BlogHost() {
        this.mapContents = new HashMap<>();
        this.tags = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.sortType = null;
    }

    public final void addPost(Content post) {
        this.addContent(post);
    }

    public final void setTitle(String authorId, String title, String text) {
        try {
            this.mapContents.get(authorId)
                    .stream()
                    .filter(content -> {
                        return content.getTitle() == title;
                    }).findFirst()
                    .orElseThrow()
                    .modifyPostTitle(text);
        } catch (Exception e) {
            System.out.println(e);
//            assert (true);
        }
    }

    public final void setBody(String authorId, String body, String text) {
        try {
            this.mapContents.get(authorId)
                    .stream()
                    .filter(content -> {
                        return content.getBody() == body;
                    }).findFirst()
                    .orElseThrow()
                    .modifyPostBody(text);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private final void addContent(Content content) {
        if (this.mapContents.containsKey(content.getAuthorId())) {
            this.mapContents.get(content.getAuthorId()).add(content);
        } else {
            ArrayList<Content> array = new ArrayList<>();
            array.add(content);
            this.mapContents.put(content.getAuthorId(), array);
        }
    }

    private final int getID() {
        return this.mapContents.size() + 1;
    }

    public final void setTags(String tag) {
        if (this.tags.contains(tag)) {
            this.tags.remove(tag);
        } else {
            this.tags.add(tag);
        }
        System.out.println(tags);
    }

    public final void setAuthors(String authorId) {
        if (this.authors.contains(authorId)) {
            this.authors.remove(authorId);
        } else {
            this.authors.add(authorId);
        }
    }

    public final void setSortType(SortType type) {
        if (this.sortType == type) {
            this.sortType = null;
        } else {
            this.sortType = type;
        }

    }

    public final ArrayList<Content> getContents() {
        ArrayList<Content> contents;

        if (authors.size() > 0) {
            contents = getBlogAuthorContents(authors);
        } else {
            contents = new ArrayList<Content>(this.mapContents.entrySet()
                    .stream()
                    .map(e -> {
                        return e.getValue();
                    })
                    .flatMap(Collection::stream)
                    .collect(Collectors.toList()));
        }
        if (tags.size() > 0) {
            contents = getTagContents(contents, tags);
        }
        if (sortType != null) {
            contents = getSortContents(contents, sortType);
        }

        return contents;
    }


    private final ArrayList<Content> getTagContents(ArrayList<Content> contents, ArrayList<String> tags) {
        if (tags == null || tags.size() <= 0) {
            return contents;
        }

        ArrayList<Content> tagContent = new ArrayList<Content>();


        tagContent.addAll(contents.stream()
                .filter(e -> {
                    for (String tag: tags) {
                        if (e.getTag().contains(tag)) {
                            return true;
                        }
                    }
                    return false;
                })
                .collect(Collectors.toList()));

        return tagContent;
    }

    private final ArrayList<Content> getBlogAuthorContents(ArrayList<String> authorId) {
        ArrayList<Content> contents = new ArrayList<>();

        if (authorId == null) {
            return new ArrayList<Content>();
        }

        authorId.forEach(e-> {
            contents.addAll(this.mapContents.get(e));
        });

        if (contents == null) {
            return new ArrayList<Content>();
        }

        return contents;
    }

    private final ArrayList<Content> getSortContents(ArrayList<Content> contents, SortType sortingType) {
        Collections.sort(contents, (lhs, rhs) -> {
            switch (sortingType) {
                case ASCENDINGPOST://DESCENDINGPOST:
                    return Long.compare(lhs.getPostTime().getLong(ChronoField.NANO_OF_DAY), rhs.getPostTime().getLong(ChronoField.NANO_OF_DAY));
                case DESCENDINGPOST://ASCENDINGPOST:
                    return Long.compare(rhs.getPostTime().getLong(ChronoField.NANO_OF_DAY), lhs.getPostTime().getLong(ChronoField.NANO_OF_DAY));
                case ASCENDINGMODIFY://DESCENDINGMODIFY:
                    return Long.compare(lhs.getModifyTime().getLong(ChronoField.NANO_OF_DAY), rhs.getModifyTime().getLong(ChronoField.NANO_OF_DAY));
                case DESCENDINGMODIFY://ASCENDINGMODIFY:
                    return Long.compare(rhs.getModifyTime().getLong(ChronoField.NANO_OF_DAY), lhs.getModifyTime().getLong(ChronoField.NANO_OF_DAY));
                case ASCENDINGTITLE:
                    return lhs.getTitle().compareTo(rhs.getTitle());
                default:
                    return 0;
            }
        });
        if (contents.size() > 0) {
            return contents;
        } else {
            return new ArrayList<Content>();
        }
    }
}
