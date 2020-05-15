package academy.pocu.comp2500.assignment1;


import academy.pocu.comp2500.assignment1.registry.Registry;


public class Program {

    private static BlogAuthor A;

    public static void main(String[] args) {
	    // write your code here
        BlogHost blog = new BlogHost();
        BlogAuthor author = new BlogAuthor("1");
        BlogAuthor author2 = new BlogAuthor("2");

        author.createPost("title", "body");
        author2.createPost("title2", "body2");
        author.addPost(blog);//, "title", "body");
        author.addPost(blog);//, "title2", "body2");
        author2.addPost(blog);//, "title3", "body3");
        author.addPost(blog);//,"title11", "body");
        author.addPost(blog);//, "title22", "body2");
        author2.addPost(blog);//, "title33", "body33");

        blog.getSortContents(BlogHost.SortType.ASCENDINGTITLE).forEach(e -> System.out.println(e.getTitle()));

//        blog.getBlogAuthorContents(author2).forEach(e -> System.out.println(e.getTitle()));
//        blog.getAllContents().forEach(e -> System.out.println(e.getTitle()));

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
