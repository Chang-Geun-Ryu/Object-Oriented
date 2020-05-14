package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;

public class BlogAuthor {
//    private ArrayList<Content> contents;

    public BlogAuthor() {
//        this.contents = new ArrayList<>();
    }

    public final void addPost(BlogHost blog, String title, String article) {
        blog.addPost(this, title, article);
    }

    public final void setTitle(BlogHost blog, String title, String text) {
        blog.setTitle(this, title, text);
    }

    public final void setArticle(BlogHost blog, String title, String text) {
        blog.setArticle(this, title, text);
    }

    public final void addTag(BlogHost blog, int postId, String tag) {
        blog.addTag(this, postId, tag);
    }
}
