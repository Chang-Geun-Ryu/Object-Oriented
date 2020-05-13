package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;

public class BlogVisitor {
    private final ArrayList<Content> contents;

    public BlogVisitor() {
        this.contents = new ArrayList<>();
    }

    public void getContents(BlogHost blog) {
        this.contents.removeAll(this.contents);
        this.contents.addAll(blog.getAllContents());
    }

    public void getTagContents(BlogHost blog, String tag) {
        this.contents.removeAll(this.contents);
        this.contents.addAll(blog.getTagContents(tag));
    }

    public void getAurthorContents(BlogHost blog, BlogAuthor author) {
        this.contents.removeAll(this.contents);
        this.contents.addAll(blog.getBlogAuthorContents(author));
    }

    public void getSortedContents(BlogHost blog, BlogHost.SortType sortingType) {
        this.contents.removeAll(this.contents);
        this.contents.addAll(blog.getSortContents(sortingType));
    }

    public void readComments(Content post) {
        post.getComments().forEach(e -> {
            System.out.print(e.getComment());
        });
    }

    public void readSortedComments(Content post) {
        post.getSortedComments().forEach(e -> {
            System.out.print(e.getComment());
        });
    }

    public void addComment(Content post, String text) {
        post.addComment(this, text);
    }

    public void addSubComment(Comment comment, String text) {
        comment.addSubcomment(text);
    }

    public void modifyComment(Comment comment, String text) {
        comment.setComment(text);
    }

    public void modifySubcomment(Comment comment, String text) {
        comment.setComment(text);
    }

    public void reactionPost(Content post, Reaction.Type type) {
        post.setReactions(this, type, true);
    }

    public void removeReactionPost(Content post, Reaction.Type type) {
        post.setReactions(this, type, false);
    }

    public void upvote(Comment comment) {
        comment.addLike(this);
    }

    public void doownvote(Comment comment) {
        comment.addHate(this);
    }
}
