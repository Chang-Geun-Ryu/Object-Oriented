package academy.pocu.comp2500.assignment1;


import java.util.Collections;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;

public class Content {
    private String title = "";
    private String body = "";
    private String authorId;
    private OffsetDateTime createDate;
    private OffsetDateTime modifyDate;
//    private ArrayList<String> tag;
//    private HashMap<String, String> tag;
    private HashSet<String> tag;
    private ArrayList<Comment> comments;
    private ArrayList<Reaction> reactions;

    public Content(String title, String body, String authorId) {
        this.createDate = OffsetDateTime.now();
        this.modifyDate = this.createDate;
        this.authorId = authorId;
        this.title = title;
        this.body = body;

        this.tag = new HashSet<String>();
        this.comments = new ArrayList<>();
        this.reactions = new ArrayList<>();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final ArrayList<String> getTag() {
        return new ArrayList<String>(this.tag);
    }

    public final OffsetDateTime getPostTime() {
        return this.createDate;
    }

    public final OffsetDateTime getModifyTime() {
        return this.modifyDate;
    }

    public final ArrayList<Comment> getComments() {
        return this.comments;
    }

    public final ArrayList<Reaction> getReactions() {
        return this.reactions;
    }

    public final void modifyPostTitle(String title) {
        this.modifyDate = OffsetDateTime.now();
        this.title = title;
        System.out.println(this.modifyDate);
    }

    public final void modifyPostBody(String body) {
        this.modifyDate = OffsetDateTime.now();
        this.body = body;
        System.out.println(this.modifyDate);
    }

    public final void addPostTag(String tag) {
        this.tag.add(tag);
    }

    public final void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public final void setReaction(Reaction.Type type, String userId) {
        this.reactions.add(new Reaction(type, userId));
    }

    public final void removeReaction(Reaction.Type type, String userId) {
        try {
            Reaction reaction = this.reactions.stream()
                    .filter(e -> e.getUserId() == userId)
                    .findFirst()
                    .orElseThrow();
            this.reactions.remove(reaction);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public final ArrayList<Comment> getSortedComments() {
        ArrayList<Comment> sortComment = getComments();

        Collections.sort(sortComment, (lhs, rhs) -> Integer.compare(rhs.getScore(), lhs.getScore()));

        return sortComment;
    }

}
