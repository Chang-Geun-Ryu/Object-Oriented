package academy.pocu.comp2500.lab7;

import java.util.HashSet;
import java.util.Objects;

public class Bundle {
    private String name;
    private HashSet<Book> books;

    public Bundle(String name) {
        this.name = name;
        this.books = new HashSet<>();
    }

    public boolean add(Book book) {
        return this.books.add(book);
    }

    public boolean remove(Book book) {
        return this.books.remove(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bundle bundle = (Bundle) o;
        return Objects.equals(name, bundle.name) &&
                Objects.equals(books, bundle.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books);
    }
}
