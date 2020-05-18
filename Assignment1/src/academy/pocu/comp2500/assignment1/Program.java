package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
	    // write your code here
        BlogHost blog = new BlogHost();
        Content post = new Content("1", "body2", "host");
        Content post2 = new Content("2", "body1", "host");
        blog.addPost(post);
        blog.addPost(post2);
        Content post3 = new Content("3", "body2", "vi");
        Content post4 = new Content("4", "body1", "vi");
        blog.addPost(post3);
        blog.addPost(post4);
        Content post5 = new Content("5", "body2", "vi2");
        Content post6 = new Content("6", "body1", "vi2");
        blog.addPost(post5);
        blog.addPost(post6);

        post5.addPostTag("1");
        post.addPostTag("1");
        post2.addPostTag("4");
        post6.addPostTag("4");
//        System.out.println("-----------DESCENDINGPOST");
//        blog.getSortContents(BlogHost.SortType.DESCENDINGPOST).forEach(e -> System.out.println(e.getTitle()));
//        System.out.println("-----------ASCENDINGPOST");
//        blog.getSortContents(BlogHost.SortType.ASCENDINGPOST).forEach(e -> System.out.println(e.getTitle()));
//
//        post.modifyPostTitle("10");
//        post2.modifyPostTitle("11");
//        System.out.println("-----------DESCENDINGMODIFY");
//        blog.getSortContents(BlogHost.SortType.DESCENDINGMODIFY).forEach(e -> System.out.println(e.getTitle()));
//        System.out.println("-----------ASCENDINGMODIFY");
//        blog.getSortContents(BlogHost.SortType.ASCENDINGMODIFY).forEach(e -> System.out.println(e.getTitle()));
//        System.out.println("-----------ASCENDINGTITLE");
//        blog.getSortContents(BlogHost.SortType.ASCENDINGTITLE).forEach(e -> System.out.println(e.getTitle()));
//        ArrayList<String> con = new ArrayList<>();
//        con.add("1");
//        con.add("3");
//        blog.setAuthors("vi2");
//        blog.setAuthors("host");
        blog.setTags("1");
//        blog.setTags("4");
        blog.setSortType(BlogHost.SortType.ASCENDINGTITLE);
        blog.getContents().forEach(e -> System.out.println(e.getTitle()));

//        blog.getBlogAuthorContents(null).forEach(e -> System.out.println(e.getTitle()));
//        blog.getTagContents(con).forEach(e -> System.out.println(e.getTitle()));
        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
