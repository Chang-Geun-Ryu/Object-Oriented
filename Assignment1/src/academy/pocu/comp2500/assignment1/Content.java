package academy.pocu.comp2500.assignment1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Content {
    private int id = 0;
    private String title = "";
    private String article = "";
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private ArrayList<String> tag;
    private BlogWriter author;
    private

    public Content(int id, String title, String article, BlogWriter author) {
        this.id = id;
        this.title = title;
        this.createDate = LocalDateTime.now();
        this.author = author;

        this.tag = new ArrayList<String>();
    }

    public Content(int id, String title, String article, BlogWriter author, String tag) {
        this.id = id;
        this.title = title;
        this.createDate = LocalDateTime.now();
        this.author = author;

        this.tag = new ArrayList<String>();
        this.tag.add(tag);
    }

    public void modifed(String title, String article, String tag) {

    }

}
