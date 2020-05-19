package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
	    // write your code here
        BlogHost blog = new BlogHost();
        Content post = new Content("1", "body2", "a1");
        Content post2 = new Content("2", "body1", "a1");
        blog.addPost(post);
        blog.addPost(post2);
        Content post3 = new Content("3", "body2", "a2");
        Content post4 = new Content("4", "body1", "a2");
        blog.addPost(post3);
        blog.addPost(post4);

        post.addPostTag("t1");
        post2.addPostTag("t2");
        post3.addPostTag("t1");
        post4.addPostTag("t2");

        blog.setTags("t1");
        blog.getContents().forEach(e-> System.out.println(e.getTitle()));
        System.out.println("------");

        blog.setTags("t1");
        blog.setTags("t2");
//        blog.setAuthors("a1");
        blog.getContents().forEach(e-> System.out.println(e.getTitle()));
        System.out.println("------");

        blog.setAuthors("a1");
        blog.setTags("t1");
        blog.setAuthors("a2");
        blog.getContents().forEach(e-> System.out.println(e.getTitle()));
        System.out.println("------");

        blog.setTags("t1");
        blog.setTags("t2");
        blog.setAuthors("a2");
        blog.setAuthors("a1");

        blog.setTags("t2");
        blog.setAuthors("a1");
        blog.getContents().forEach(e-> System.out.println(e.getTitle()));

        blog.setAuthors("");


        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
