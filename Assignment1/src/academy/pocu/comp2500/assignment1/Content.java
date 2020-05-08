package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class Content {
    private int id = 0;
    private String title = "";
    private String article = "";
    private OffsetDateTime createDate;
    private OffsetDateTime modifyDate;
    private ArrayList<String> tag;
    private BlogAuthor author;
    private ArrayList<Comment> comments;
    private HashMap<BlogVisitor, Reaction> mapReactions;

    public Content(int id, String title, String article, BlogAuthor author) {
        this.id = id;
        this.title = title;
        this.createDate = OffsetDateTime.now();
        this.modifyDate = this.createDate;
        this.author = author;

        this.tag = new ArrayList<String>();
        this.comments = new ArrayList<Comment>();
        this.mapReactions = new HashMap<BlogVisitor, Reaction>();
    }

    public Content(int id, String title, String article, BlogAuthor author, String tag) {
        this.id = id;
        this.title = title;
        this.createDate = OffsetDateTime.now();
        this.modifyDate = this.createDate;
        this.author = author;

        this.tag = new ArrayList<String>();
        this.tag.add(tag);
        this.comments = new ArrayList<Comment>();
        this.mapReactions = new HashMap<BlogVisitor, Reaction>();
    }

    public final BlogAuthor getAuthor() {
        return this.author;
    }

    public final int getId() {
        return this.id;
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

    public final String getTitle() {
        return this.title;
    }

    public final void addComment(String comment) {
        this.comments.add(new Comment(comment));
    }

    public final void setReactions(BlogVisitor visitor, Reaction.ReactionType type, boolean status) {
        if (mapReactions.containsKey(visitor)) {
            mapReactions.get(visitor).setStatus(type, status);
        } else {
            Reaction reaction = new Reaction();
            reaction.setStatus(type, status);
            mapReactions.put(visitor, reaction);
        }
    }

    public final ArrayList<Comment> getSortedComments() {
        Collections.sort(this.comments, new Comparator<Comment>() {
            @Override
            public int compare(Comment lhs, Comment rhs) {
                // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                return lhs.getScore() > rhs.getScore() ? -1 : (lhs.getScore() < rhs.getScore()) ? 1 : 0;
            }
        });

        return this.comments;
    }

}
