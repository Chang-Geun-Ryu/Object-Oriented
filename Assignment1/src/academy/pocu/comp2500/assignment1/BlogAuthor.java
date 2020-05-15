package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;

public class BlogAuthor {
    String id;

    ArrayList<Integer> postIds;

    public BlogAuthor(String id) {
//        this.contents = new ArrayList<>();
        this.id = id;
        postIds = new ArrayList<>();
    }

    public final void addPost(BlogHost blog) {
//        blog.addPost(this.id, "title", "article");
    }

    public final Content createPost(int id, BlogAuthor author) {
        return new Content(id, this);
    }

    public final void setTitle(BlogHost blog, String title, String text) {
        blog.setTitle(this.id, title, text);
    }

    public final void setArticle(BlogHost blog, String title, String text) {
        blog.setArticle(this.id, title, text);
    }

    public final void addTag(BlogHost blog, int postId, String tag) {
        blog.addTag(this.id, postId, tag);
    }
}
