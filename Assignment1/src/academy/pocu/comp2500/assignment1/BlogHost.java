package academy.pocu.comp2500.assignment1;

import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.stream.Collectors;

public final class BlogHost {
    private final HashMap<BlogAuthor, ArrayList<Content>> mapContents;
//    private final ArrayList<Integer> contentIds;


    public enum SortType {
        DESCENDINGPOST,
        ASCENDINGPOST,
        DESCENDINGMODIFY,
        ASCENDINGMODIFY,
        ASCENDINGTITLE
    }

    public BlogHost() {
        this.mapContents = new HashMap<>();
    }

    public final void addPost(Content post) {
        this.addContent(post);
    }

    public final void setTitle(String author, String title, String text) {
        this.mapContents.get(author)
                .stream()
                .filter(content -> {
                    return content.getTitle() == title;
                }).findFirst()
                .orElseThrow()
                .modifyPostTitle(text);
    }

    public final void setArticle(String author, String title, String text) {
        this.mapContents.get(author)
                .stream()
                .filter(content -> {
                    return content.getTitle() == title;
                }).findFirst()
                .orElseThrow()
                .modifyPostArticle(text);
    }

    public final void addTag(String author, int postId, String tag) {
        this.mapContents.entrySet()
                .stream()
                .map(e -> {
                    return e.getValue();
                })
                .flatMap(Collection::stream)
                .filter(e -> {
                    return e.getId() == postId;
                })
                .findFirst()
                .orElseThrow()
                .addPostTag(tag);
    }

    private final void addContent(Content content) {
        if (this.mapContents.containsKey(content.getAuthor())) {
            this.mapContents.get(content.getAuthor()).add(content);
        } else {
            ArrayList<Content> array = new ArrayList<>();
            array.add(content);
            this.mapContents.put(content.getAuthor(), array);
        }
    }

    private final int getID() {
        return this.mapContents.size() + 1;
    }

    // Visitor functions

    public final ArrayList<Content> getAllContents() {
        return new ArrayList<Content>(this.mapContents.entrySet()
                .stream()
                .map(e -> {
                    return e.getValue();
                })
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
    }

    public final ArrayList<Content> getTagContents(String tag) {
        return new ArrayList<Content>(this.mapContents.entrySet()
                .stream()
                .map(e -> {
                    return e.getValue();
                })
                .flatMap(Collection::stream)
                .filter(e -> {
                    return e.getTag().contains(tag);
                })
                .collect(Collectors.toList()));
    }

    public final ArrayList<Content> getBlogAuthorContents(BlogAuthor author) {
        return this.mapContents.get(author);
    }

    public final ArrayList<Content> getSortContents(SortType sortingType) {
        ArrayList<Content> contents = getAllContents();

        Collections.sort(contents, (lhs, rhs) -> {
            switch (sortingType) {
                case DESCENDINGPOST:
                    return Long.compare(lhs.getPostTime(), rhs.getPostTime());
                case ASCENDINGPOST:
                    return Long.compare(rhs.getPostTime(), lhs.getPostTime());
                case DESCENDINGMODIFY:
                    return Long.compare(lhs.getModifyTime(), rhs.getModifyTime());
                case ASCENDINGMODIFY:
                    return Long.compare(rhs.getModifyTime(), lhs.getModifyTime());
                case ASCENDINGTITLE:
                    return lhs.getTitle().compareTo(rhs.getTitle());
                default:
                    assert(true);
                    return 1;
            }
        });

        return contents;
    }
}
