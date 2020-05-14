package academy.pocu.comp2500.assignment1;

import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.stream.Collectors;

public final class BlogHost {
    private final HashMap<BlogAuthor, ArrayList<Content>> mapContents;
    private final BlogAuthor host;

    public enum SortType {
        DESCENDINGPOST,
        ASCENDINGPOST,
        DESCENDINGMODIFY,
        ASCENDINGMODIFY,
        ASCENDINGTITLE
    }

    public BlogHost() {
        this.mapContents = new HashMap<>();
        this.host = new BlogAuthor();
    }

    public final void addPost(BlogAuthor author, String title, String article) {
        this.addContent(new Content(this.getID(), title, article, author));
    }

    public final void setTitle(BlogAuthor author, String title, String text) {
        this.mapContents.get(author)
                .stream()
                .filter(content -> {
                    return content.getTitle() == title;
                }).findFirst()
                .orElseThrow()
                .modifyPostTitle(text);
    }

    public final void setArticle(BlogAuthor author, String title, String text) {
        this.mapContents.get(author)
                .stream()
                .filter(content -> {
                    return content.getTitle() == title;
                }).findFirst()
                .orElseThrow()
                .modifyPostArticle(text);
    }

    public final void addTag(BlogAuthor author, int postId, String tag) {
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

            Collections.sort(contents, new Comparator<Content>() {
                @Override
                public int compare(Content lhs, Content rhs) {
                    // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                    switch (sortingType) {
                        case DESCENDINGPOST:
                            return lhs.getPostTime() > rhs.getPostTime() ? -1 : (lhs.getPostTime() < rhs.getPostTime()) ? 1 : 0;
                        case ASCENDINGPOST:
                            return lhs.getPostTime() < rhs.getPostTime() ? -1 : (lhs.getPostTime() < rhs.getPostTime()) ? 1 : 0;
                        case DESCENDINGMODIFY:
                            return lhs.getModifyTime() > rhs.getModifyTime() ? -1 : (lhs.getModifyTime() < rhs.getModifyTime()) ? 1 : 0;
                        case ASCENDINGMODIFY:
                            return lhs.getModifyTime() < rhs.getModifyTime() ? -1 : (lhs.getModifyTime() < rhs.getModifyTime()) ? 1 : 0;
                        case ASCENDINGTITLE:
                            return lhs.getTitle().compareTo(rhs.getTitle());
                        default:
                            assert(true);
                            return 1;
                    }

//                return lhs.getScore() > rhs.getScore() ? -1 : (lhs.getScore() < rhs.getScore()) ? 1 : 0;
                }
            });

        return contents;
    }
}
