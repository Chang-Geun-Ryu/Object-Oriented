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
//    private FilterType  filterType;

    private enum FilterType {
        TAG,
        AUTHOR,
        SORT,
        NULL
    }

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
//        this.filterType = null;
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

    /*
    public final void addTag(String authorId, String title, String tag) {
        try {
            this.mapContents.entrySet()
                    .stream()
                    .map(e -> {

//                    System.out.println(e.getValue());
                        return e.getValue();
                    })
                    .flatMap(Collection::stream)
                    .filter(e -> {
//                    System.out.println(title);
//                    System.out.println(e.getId());
                        return e.getTitle() == title;
                    })
                    .findFirst()
                    .orElseThrow()
                    .addPostTag(tag);
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/

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

    // Visitor functions

    public final void setTags(String tag) {
        if (this.tags.contains(tag)) {
            this.tags.remove(tag);
        } else {
            this.tags.add(tag);
        }
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
        if (authors.size() > 0) {
            return getBlogAuthorContents(authors);
        } else if (tags.size() > 0) {
            return getTagContents(tags);
        } else if (sortType != null) {
            return getSortContents(sortType);
        } else {
        return new ArrayList<Content>(this.mapContents.entrySet()
                .stream()
                .map(e -> {
                    return e.getValue();
                })
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
        }
    }

    public final ArrayList<Content> getTagContents(ArrayList<String> tags) {
        ArrayList<Content> contents = new ArrayList<>();

        if (tags == null) {
            return new ArrayList<Content>();
        }

        tags.forEach(e-> {
            contents.addAll(new ArrayList<Content>(this.mapContents.entrySet()
                    .stream()
                    .map(c -> { return c.getValue();})
                    .flatMap(Collection::stream)
                    .filter(c -> { return c.getTag().contains(e);})
                    .collect(Collectors.toList())));
        });

        return contents;
//        new ArrayList<Content>(this.mapContents.entrySet()
//                .stream()
//                .map(e -> { return e.getValue();})
//                .flatMap(Collection::stream)
//                .filter(e -> { return e.getTag().contains(tag);})
//                .collect(Collectors.toList()));
    }

//    public final ArrayList<Content> getBlogAuthorContents(String authorId) {
    public final ArrayList<Content> getBlogAuthorContents(ArrayList<String> authorId) {
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

//        if (this.mapContents.size() > 0) {
//            try {
//                return this.mapContents.get(authorId);
//            } catch (Exception e) {
//                return new ArrayList<Content>();
//            }
//        }
//        return new ArrayList<Content>();
    }

    public final ArrayList<Content> getSortContents(SortType sortingType) {
        ArrayList<Content> contents = new ArrayList<Content>(this.mapContents.entrySet()
                .stream()
                .map(e -> {
                    return e.getValue();
                })
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));

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
//                    assert(true);
                    return 0;
            }
        });

        return contents;
    }
}
