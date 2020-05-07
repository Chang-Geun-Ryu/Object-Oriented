package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    private static BlogAuthor A;

    public static void main(String[] args) {
	    // write your code here
        HashMap<BlogAuthor, ArrayList<String>> map = new HashMap<>();

        BlogAuthor a = new BlogAuthor();
        BlogAuthor b = new BlogAuthor();

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        map.put(a, list);
//        map.put(b, "b");

        add(a);

        if (map.containsKey(get())) {
            map.get(get()).add("aaa");
            System.out.println("finded a");
        } else {
            System.out.println("can't find a");
        }

        if (map.containsKey(b)) {
            System.out.println("finded b");
        } else {
            System.out.println("can't find b");
        }

        System.out.println("map:" + map);

    }

    public static void add(BlogAuthor author) {
        Program.A = author;
    }

    public static BlogAuthor get() {
        return Program.A;
    }
}
