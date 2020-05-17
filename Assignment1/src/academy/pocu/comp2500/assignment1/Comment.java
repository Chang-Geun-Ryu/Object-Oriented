package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;

public class Comment {
    private String sComment;
    private ArrayList<String> likes;
    private ArrayList<String> hates;
    private final ArrayList<Comment> subcomment;

    public Comment(String comment) {
        this.likes = new ArrayList<>();
        this.hates = new ArrayList<>();
        this.sComment = comment;
        this.subcomment = new ArrayList<>();
    }

    public final void addLike(String user) {
        if (this.likes.contains(user) == false) {
            this.likes.add(user);
        }
    }

    public final void addHate(String user) {
        if (this.hates.contains(user) == false) {
            this.hates.add(user);
        }
    }

    public final int getScore() {
        return this.likes.size() - this.hates.size();
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
