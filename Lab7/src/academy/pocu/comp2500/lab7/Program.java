package academy.pocu.comp2500.lab7;

public class Program {

    public static void main(String[] args) {
	    // write your code here
        Author author = new Author("James", "Bond");
        Book book0 = new Book("How to be the best", author, 1990, Genre.BIOGRAPHY);
        Bookshelf bookshelf = new Bookshelf(10);

        assert (bookshelf.add(book0));
        bookshelf.toString();
        assert (bookshelf.remove(book0));
        assert (!bookshelf.remove(book0));



        Book book1 = new Book("C# for dummies", new Author("Jason", "Bourne"), 2005, Genre.ROMANCE);
        Book book2 = new Book("C# for dummies", new Author("Jason", "Bourne"), 2005, Genre.ROMANCE);
        Book book3 = new Book("Java for dummies", new Author("James", "Bond"), 2007, Genre.MYSTERY);

        Bundle bundle = new Bundle("Programming");

        assert (bundle.add(book0));
        assert (bundle.add(book1));
        assert (!bundle.add(book2));
        assert (bundle.add(book3));

        assert (bundle.remove(book3));
        assert (bundle.remove(book0));
        assert (!bundle.remove(book0));

        ReadingList readingList = new ReadingList("Summer Break Homework");
        ReadingList readingList1 = new ReadingList("Summer Break Homework");

        assert (readingList.add(book0));
        assert (readingList.add(book1));
        assert (readingList.add(book2));
        assert (readingList.add(book3));
        readingList1.add(book0);
        readingList1.add(book2);
        readingList1.add(book1);
        readingList1.add(book3);

        boolean b = readingList.hashCode() == readingList1.hashCode();
        boolean a = readingList.equals(readingList1);


        assert (readingList.remove(book3));
        assert (readingList.remove(book0));
        assert (!readingList.remove(book0));
    }
}
