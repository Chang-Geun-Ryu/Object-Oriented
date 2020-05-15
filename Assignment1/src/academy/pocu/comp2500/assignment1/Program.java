package academy.pocu.comp2500.assignment1;


import academy.pocu.comp2500.assignment1.registry.Registry;


public class Program {

    private static BlogAuthor A;

    public static void main(String[] args) {
	    // write your code here
        BlogHost blog = new BlogHost();
        BlogAuthor author = new BlogAuthor("1");
        BlogAuthor author2 = new BlogAuthor("2");

        blog.addPost(author.createPost("title", "body"));
        blog.addPost(author.createPost("title2", "body2"));
        blog.addPost(author2.createPost("title3", "body3"));

        blog.getBlogAuthorContents(author2).forEach(e -> System.out.println(e.getTitle()));
//        blog.getAllContents().forEach(e -> System.out.println(e.getTitle()));

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
