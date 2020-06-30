package academy.pocu.comp2500.lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Bookshelf)) {
            return false;
        }
        Bookshelf bookshelf = (Bookshelf) o;
        return this == bookshelf;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = hash * 31 + maxCount;
        hash = hash * 31 + (this.shelf == null ? 0 : this.shelf.hashCode());
        return hash;
    }
}
