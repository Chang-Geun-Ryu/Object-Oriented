package academy.pocu.comp2500.lab7;

import java.util.ArrayList;

public class Bookshelf {
    private int maxCount;
    private ArrayList<Book> shelf;

    public Bookshelf(int maxCount) {
        this.maxCount = maxCount;
//        this.shelf = new HashSet<>();
        this.shelf = new ArrayList<>();
    }

    public boolean add(Book book) {
        if (maxCount <= shelf.size()) {
            return false;
        }

        return this.shelf.add(book);
    }

    public boolean remove(Book book) {
        if (shelf.size() == 0) {
            return false;
        }

        return this.shelf.remove(book);
    }

//    private boolean equalBooks(Bookshelf bookshelf) {
//        if (this.shelf.size() != bookshelf.shelf.size()) {
//            return false;
//        }
//
//        for (Book book : this.shelf) {
//            bookshelf.shelf.contains()
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Bookshelf)) {
            return false;
        }
        Bookshelf bookshelf = (Bookshelf) o;
        return maxCount == bookshelf.maxCount &&
                this.shelf.equals(bookshelf.shelf) &&
                this.shelf.hashCode() == bookshelf.shelf.hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash *= maxCount;
        for (Book book: this.shelf) {
            hash = hash * 31 + book.hashCode();
        }
        return hash;
    }
}
