package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
	    // write your code here
        BlogHost blog = new BlogHost();

        blog.addPost(new Content("title", "body", "host"));
        blog.addPost(new Content("title1", "body", "host"));
        blog.addPost(new Content("title2", "body", "host"));


        blog.setTitle("host", "1", "22");
        blog.setTitle("host", "title", "modititle");
        blog.setBody("host", "title2", "body111");
//        blog.getBlogAuthorContents("host").forEach(e -> System.out.println(e.getBody()));
        blog.getAllContents().forEach(e -> {
            System.out.println(e.getTitle());
            System.out.println(e.getBody());
        });

//        blog.getSortContents(BlogHost.SortType.DESCENDINGMODIFY).forEach(e -> System.out.println(e.getTitle()));
        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
