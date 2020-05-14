package academy.pocu.comp2500.assignment1;


import academy.pocu.comp2500.assignment1.registry.Registry;


public class Program {

    private static BlogAuthor A;

    public static void main(String[] args) {
	    // write your code here
        BlogHost blog = new BlogHost();

        BlogAuthor author = new BlogAuthor();
        blog.addPost(author,"1", "article 1");
        blog.addPost(author,"2", "article 2");
        blog.addTag(author, 1, "tag 1");
        blog.addTag(author, 2, "tag 2");

        blog.getTagContents("tag 2").forEach(e -> {
            System.out.print(e.getTitle());
        });

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
