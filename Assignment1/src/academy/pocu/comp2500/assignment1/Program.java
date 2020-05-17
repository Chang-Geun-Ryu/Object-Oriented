package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

public class Program {

    public static void main(String[] args) {
	    // write your code here
        BlogHost blog = new BlogHost();

        blog.addPost(new Content("title", "body", "host"));
        blog.addPost(new Content("title1", "body", "host"));
        blog.addPost(new Content("title2", "body", "host"));

        blog.getBlogAuthorContents("host").forEach(e -> System.out.println(e.getTitle()));

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
