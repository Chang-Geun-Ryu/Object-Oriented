package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.HashMap;

public class BlogHost {
    private final HashMap<BlogAuthor, ArrayList<Content>> mapContents;
    private final BlogAuthor host;

    public BlogHost() {
        this.mapContents = new HashMap<>();
        this.host = new BlogAuthor();
    }

    public final void post(String title, String article) {
        Content content = new Content(this.getID(), title, article, this.host);
        this.addContent(content);
    }

    public final void post(BlogAuthor writer, String title, String article) {
        Content content = new Content(this.getID(), title, article, writer);
        this.addContent(content);
    }

    private final void addContent(Content content) {
        if (this.mapContents.containsKey(content.getAuthor())) {
            this.mapContents.get(content.getAuthor()).add(content);
        } else {
            ArrayList<Content> array = new ArrayList<>();
            array.add(content);
            this.mapContents.put(content.getAuthor(), array);
        }
    }

    private final int getID() {
        return this.mapContents.size() + 1;
    }

}
