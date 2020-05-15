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
    private String article = "";
    private String author;
    private OffsetDateTime createDate;
    private OffsetDateTime modifyDate;
    private ArrayList<String> tag;
    private HashMap<BlogVisitor, ArrayList<Comment>> comments;
    private HashMap<BlogVisitor, Reaction> mapReactions;

    public Content(String title, String body, String authorId) {
        this.createDate = OffsetDateTime.now();
        this.modifyDate = this.createDate;
        this.author = authorId;
        this.title = title;
        this.article = body;

        this.tag = new ArrayList<String>();
        this.comments = new HashMap<BlogVisitor, ArrayList<Comment>>();
        this.mapReactions = new HashMap<BlogVisitor, Reaction>();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getArticle() {
        return this.article;
    }

    public final String getAuthor() {
        return this.author;
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
        return new ArrayList<Comment>(this.comments.entrySet()
                .stream()
                .map(e -> {
                    return e.getValue();
                })
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
    }

    public final HashMap<BlogVisitor, Reaction> getMapReactions() {
        return this.mapReactions;
    }

    public final void updatePost(String title, String article, String tag) {
        this.modifyDate = OffsetDateTime.now();
        this.title = title;
        this.article = article;
        this.tag.add(tag);
    }

    public final void modifyPostTitle(String title) {
        this.modifyDate = OffsetDateTime.now();
        this.title = title;
    }

    public final void modifyPostArticle(String article) {
        this.modifyDate = OffsetDateTime.now();
        this.article = article;
    }

    public final void addPostTag(String tag) {
        this.modifyDate = OffsetDateTime.now();
        this.tag.add(tag);
    }

    public final void addComment(BlogVisitor visitor, String comment) {
//        this.comments.add(new Comment(comment));
        if (this.comments.containsKey(visitor)) {
            this.comments.get(visitor).add(new Comment(comment));
        } else {
            ArrayList<Comment> array = new ArrayList<>();
            array.add(new Comment(comment));
            this.comments.put(visitor, array);
        }
    }

    public final void setReactions(BlogVisitor visitor, Reaction.Type type, boolean status) {
        if (mapReactions.containsKey(visitor)) {
            mapReactions.get(visitor).setStatus(type, status);
        } else {
            Reaction reaction = new Reaction();
            reaction.setStatus(type, status);
            mapReactions.put(visitor, reaction);
        }
    }

    public final ArrayList<Comment> getSortedComments() {
        ArrayList<Comment> sortComment = getComments();

        Collections.sort(sortComment, (lhs, rhs) -> Integer.compare(lhs.getScore(), rhs.getScore()));

        return sortComment;
    }

}
