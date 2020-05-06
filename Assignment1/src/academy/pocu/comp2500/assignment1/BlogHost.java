package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.HashMap;

public class BlogHost {
    private final ArrayList<String> articleTitles = new ArrayList<String>();
    private final HashMap<String, String> articles = new HashMap<String, String>();

    public BlogHost() {
    }

    public final boolean post(String titleName, String contents) {
        if (this.articleTitles.contains(titleName)) {
            return false;
        }

        this.articleTitles.add(titleName);
        articles.put(titleName, contents);
        return true;
    }

    public final ArrayList<String> content() {

        return this.articleTitles;
    }
}
