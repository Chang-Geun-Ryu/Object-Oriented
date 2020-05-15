package academy.pocu.comp2500.assignment1;


import academy.pocu.comp2500.assignment1.registry.Registry;


public class Program {

    private static BlogAuthor A;

    public static void main(String[] args) {
	    // write your code here
        BlogHost blog = new BlogHost();
        BlogAuthor author = new BlogAuthor("1");

        Content post = author.createPost("title", "body");
        blog.addPost(post);
        Content post2 = author.createPost("title2", "body2");
        blog.addPost(post2);

        blog.getAllContents().forEach(e -> System.out.println(e.getTitle()));

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
