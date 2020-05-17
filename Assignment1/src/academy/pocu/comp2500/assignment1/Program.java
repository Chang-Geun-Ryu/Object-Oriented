package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

public class Program {

    public static void main(String[] args) {
	    // write your code here
        BlogHost blog = new BlogHost();
        Content post = new Content("title", "body2", "host");
        Content post2 = new Content("title1", "body1", "host");
        blog.addPost(post);
        blog.addPost(post2);
        Content post3 = new Content("title", "body2", "vi");
        Content post4 = new Content("title1", "body1", "vi");
        blog.addPost(post3);
        blog.addPost(post4);
//        blog.addPost(new Content("title2", "body", "host"));

        post4.setReaction(Reaction.Type.ANGRY, "123");

        post4.getReactions().forEach(e-> System.out.println(e.getUserId()));

//        blog.getBlogAuthorContents("host").forEach(e -> System.out.println(e.getBody()));
//        blog.getAllContents().forEach(e -> {
//            System.out.print(e.getTitle());
//            System.out.print("_");
//            System.out.println(e.getBody());
//        });

//        blog.getSortContents(BlogHost.SortType.DESCENDINGMODIFY).forEach(e -> System.out.println(e.getTitle()));
        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
