package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;

public class Comment {
    private String sComment;
    private ArrayList<BlogVisitor> Likes;
    private ArrayList<BlogVisitor> Hates;
    private final ArrayList<Comment> subcomment;

    public Comment(String comment) {
        this.Likes = new ArrayList<BlogVisitor>();
        this.Hates = new ArrayList<BlogVisitor>();
        this.sComment = comment;
        this.subcomment = new ArrayList<Comment>();
    }

    public final void addLike(BlogVisitor visitor) {
        if (this.Likes.contains(visitor) == false) {
            this.Likes.add(visitor);
        }
    }

    public final void addHate(BlogVisitor visitor) {
        if (this.Hates.contains(visitor) == false) {
            this.Hates.add(visitor);
        }
    }

    public final int getScore() {
        return this.Likes.size() - this.Hates.size();
    }

    public final void setComment(String comment) {
        this.sComment = comment;
    }

    public final void addSubcomment(String subcomment) {
        this.subcomment.add(new Comment(subcomment));
    }

    public final String getComment() {
        return sComment;
    }
}
