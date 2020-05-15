package academy.pocu.comp2500.assignment1;


import academy.pocu.comp2500.assignment1.registry.Registry;


public class Program {

    public static void main(String[] args) {
	    // write your code here
        BlogHost blog = new BlogHost();
        BlogAuthor author = new BlogAuthor("title", "body");
        BlogAuthor author2 = new BlogAuthor("title2", "body");

//        blog.addPost(new Content("title", "body"));
//        blog.addPost(new Content("title2", "body2"));
//        blog.addPost(new Content("title3", "body3"));
        blog.addPost("title", "body");
        blog.addPost("title1", "body2");
        blog.addPost("title3", "body4");

        blog.getSortContents(BlogHost.SortType.ASCENDINGTITLE).forEach(e -> System.out.println(e.getTitle()));

//        blog.getBlogAuthorContents(author2).forEach(e -> System.out.println(e.getTitle()));
//        blog.getAllContents().forEach(e -> System.out.println(e.getTitle()));

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
