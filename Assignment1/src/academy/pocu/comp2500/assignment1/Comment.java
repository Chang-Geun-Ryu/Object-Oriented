package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;

public class Comment {
    private final String sComment;
    private int nLikes;
    private int nHates;
    private final ArrayList<Comment> subcomment;

    public Comment(String comment) {
        this.nLikes = 0;
        this.nHates = 0;
        this.sComment = comment;
        this.subcomment = new ArrayList<Comment>();
    }

    public final void addLike() {
        this.nLikes++;
    }

    public final void addHate() {
        this.nHates++;
    }

    public final int getScore() {
        return this.nLikes - this.nHates;
    }

    public final void addSubcomment(String subcomment) {
        this.subcomment.add(new Comment(subcomment));
    }
}
