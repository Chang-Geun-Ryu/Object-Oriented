package academy.pocu.comp2500.lab7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Bookshelf {
    private int maxCount;
//    private HashSet<Book> shelf;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bookshelf bookshelf = (Bookshelf) o;
        return maxCount == bookshelf.maxCount &&
                Objects.equals(shelf, bookshelf.shelf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxCount, shelf);
    }
}
