package academy.pocu.comp2500.assignment1;


import academy.pocu.comp2500.assignment1.registry.Registry;


public class Program {

    private static BlogAuthor A;

    public static void main(String[] args) {
	    // write your code here
        BlogHost blog = new BlogHost();
        BlogAuthor author = new BlogAuthor("1");

        blog.addPost(author);


        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
