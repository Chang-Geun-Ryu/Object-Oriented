package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Collectors;

public class BlogHost {
    private final HashMap<BlogAuthor, ArrayList<Content>> mapContents;
    private final BlogAuthor host;

    public BlogHost() {
        this.mapContents = new HashMap<>();
        this.host = new BlogAuthor();
    }

    // Author functions
    public final void post(String title, String article) {
        this.addContent(new Content(this.getID(), title, article, this.host));
    }

    public final void addPost(BlogAuthor author, String title, String article) {
        this.addContent(new Content(this.getID(), title, article, author));
    }

    public final void setTitle(BlogAuthor author, String title, String modified) {
        this.mapContents.get(author)
                .stream()
                .filter(content -> {
                    return content.getTitle() == title;
                }).findFirst()
                .orElseThrow()
                .modifyPostTitle(modified);
    }

    public final void setArticle(BlogAuthor author, String title, String modified) {
        this.mapContents.get(author)
                .stream()
                .filter(content -> {
                    return content.getTitle() == title;
                }).findFirst()
                .orElseThrow()
                .modifyPostArticle(modified);
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
}
