package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
	    // write your code here
        BlogHost blog = new BlogHost();
        Content post = new Content("title", "body2", "host");
        blog.addPost(post);
        blog.addPost(new Content("title1", "body1", "host"));
        blog.addPost(new Content("title2", "body", "host"));

        blog.setTitle("host", "1", "22");
        blog.setTitle("host", "title", "modititle");
        blog.setBody("host", "body", "body111");
//        blog.getBlogAuthorContents("host").forEach(e -> System.out.println(e.getBody()));
        blog.getAllContents().forEach(e -> {
            System.out.print(e.getTitle());
            System.out.print("_");
            System.out.println(e.getBody());
        });

        Comment comment = new Comment("com1", "1");
        Comment comment2 = new Comment("com2", "2");
        post.addComment(comment);
        post.addComment(comment2);

        comment2.addLike("11");

        post.getSortedComments().forEach(e -> System.out.println(e.getComment()));


//        blog.getSortContents(BlogHost.SortType.DESCENDINGMODIFY).forEach(e -> System.out.println(e.getTitle()));
        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
