package academy.pocu.comp2500.assignment1;


import academy.pocu.comp2500.assignment1.registry.Registry;


public class Program {

    public static void main(String[] args) {
	    // write your code here
        BlogHost blog = new BlogHost();

        blog.addPost(new Content("title", "body", "host"));
        blog.addPost(new Content("title1", "body", "host"));
        blog.addPost(new Content("title2", "body", "author"));

//        blog.addTag("host", "title", "1");
//        blog.addTag("host", "title1", "2");
//        blog.getTagContents("2").forEach(e -> System.out.println(e.getTitle()));
        blog.getBlogAuthorContents("author").forEach(e -> System.out.println(e.getTitle()));
//        BlogAuthor author = new BlogAuthor("title", "body");
//        BlogAuthor author2 = new BlogAuthor("title2", "body");
//
//        blog.addPost(new Content("title", "body", "a"));
//        blog.addPost(new Content("title2", "body2", "b"));
//        blog.addPost(new Content("title3", "body3", "c"));
//
//        blog.addTag("a", "title", "aaa");

//        blog.getAllContents().forEach(e -> System.out.println(e.getTitle()));
//        blog.getTagContents("aaa").forEach(e -> System.out.println(e.getTitle()));
//        blog.getSortContents(BlogHost.SortType.ASCENDINGTITLE).forEach(e -> System.out.println(e.getTitle()));

//        blog.getBlogAuthorContents(author2).forEach(e -> System.out.println(e.getTitle()));
//        blog.getAllContents().forEach(e -> System.out.println(e.getTitle()));

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
