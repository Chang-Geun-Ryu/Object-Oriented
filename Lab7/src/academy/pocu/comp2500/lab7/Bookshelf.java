package academy.pocu.comp2500.lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Bookshelf {
    private int maxCount;
    private HashSet<Book> shelf;

    public Bookshelf(int maxCount) {
        this.maxCount = maxCount;
//        this.shelf = new HashSet<>();
        this.shelf = new HashSet<>();
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
//        ArrayList<Book> shelf = new ArrayList<Book>(bookshelf.shelf);
//
//        for (int i = 0; i < this.shelf.size(); ++i) {
//            if (shelf.get(i).hashCode() != this.shelf.get(i).hashCode()) {
//                return false;
//            }
//
//            shelf.remove(this.shelf.get(i));
//        }
//
//        return true;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Bookshelf) || hashCode() != o.hashCode()) {
            return false;
        }
        Bookshelf bookshelf = (Bookshelf) o;
        return this.shelf.equals(bookshelf.shelf);
//                equalBooks(bookshelf);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        for (Book book: this.shelf) {
            hash = hash * 31 + this.hashCode();
        }
//        hash = hash * 31 + maxCount;
//        hash = hash * 31 + this.shelf.hashCode();
        return hash;
    }
}
