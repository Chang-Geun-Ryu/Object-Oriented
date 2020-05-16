package academy.pocu.comp2500.assignment1;

import java.time.temporal.ChronoField;
import java.time.OffsetDateTime;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;

public class Content {
    private String title = "";
    private String body = "";
    private String authorId;
    private OffsetDateTime createDate;
    private OffsetDateTime modifyDate;
    private ArrayList<String> tag;
//    private HashMap<BlogVisitor, ArrayList<Comment>> comments;
//    private HashMap<BlogVisitor, Reaction> mapReactions;
    private ArrayList<Comment> comments;
    private ArrayList<Reaction> reactions;

    public Content(String title, String body, String authorId) {
        this.createDate = OffsetDateTime.now();
        this.modifyDate = this.createDate;
        this.authorId = authorId;
        this.title = title;
        this.body = body;

        this.tag = new ArrayList<String>();
        this.comments = new ArrayList<>();
        this.reactions = new ArrayList<>();
//        this.comments = new HashMap<BlogVisitor, ArrayList<Comment>>();
//        this.mapReactions = new HashMap<BlogVisitor, Reaction>();
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
        return this.tag;
    }

    public final long getPostTime() {
        return this.createDate.getLong(ChronoField.MICRO_OF_DAY);
    }

    public final long getModifyTime() {
        return this.modifyDate.getLong(ChronoField.MICRO_OF_DAY);
    }

    public final ArrayList<Comment> getComments() {
        return this.comments;
//        return new ArrayList<Comment>(this.comments.entrySet()
//                .stream()
//                .map(e -> {
//                    return e.getValue();
//                })
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList()));
    }

    public final ArrayList<Reaction> getReactions() {
        return this.reactions;
    }

    public final void updatePost(String title, String authorId, String tag) {
        this.modifyDate = OffsetDateTime.now();
        this.title = title;
        this.authorId = authorId;
        this.tag.add(tag);
    }

    public final void modifyPostTitle(String title) {
        this.modifyDate = OffsetDateTime.now();
        this.title = title;
    }

    public final void modifyPostBody(String body) {
        this.modifyDate = OffsetDateTime.now();
        this.body = body;
    }

    public final void addPostTag(String tag) {
        this.modifyDate = OffsetDateTime.now();
        this.tag.add(tag);
    }

    public final void addComment(Comment comment) {
        this.comments.add(comment);
//        this.comments.add(new Comment(comment));
//        if (this.comments.containsKey(comment)) {
//            this.comments.get(visitor).add(new Comment(comment));
//        } else {
//            ArrayList<Comment> array = new ArrayList<>();
//            array.add(new Comment(comment));
//            this.comments.put(visitor, array);
//        }
    }

    public final void setReaction(Reaction.Type type, String visitorId) {
        this.reactions.add(new Reaction(type, visitorId));
//        if (mapReactions.containsKey(visitor)) {
//            mapReactions.get(visitor).setStatus(type, status);
//        } else {
//            Reaction reaction = new Reaction();
//            reaction.setStatus(type, status);
//            mapReactions.put(visitor, reaction);
//        }
    }

    public final void removeReaction(Reaction.Type type, String visitorId) {
        Reaction reaction = this.reactions.stream()
                .filter(e -> e.getVisitorId() == visitorId)
                .findFirst()
                .orElseThrow();
        this.reactions.remove(reaction);
    }

    public final ArrayList<Comment> getSortedComments() {
        ArrayList<Comment> sortComment = getComments();

        Collections.sort(sortComment, (lhs, rhs) -> Integer.compare(lhs.getScore(), rhs.getScore()));

        return sortComment;
    }

}
