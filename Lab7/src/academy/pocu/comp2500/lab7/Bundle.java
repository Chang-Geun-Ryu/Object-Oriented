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
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Bundle)) {
            return false;
        }
        Bundle bundle = (Bundle) o;
        return this.name.equals(bundle.name) &&
                this.books.equals(bundle.books);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash * 31 + (this.name == null ? 0 : this.name.hashCode());
        for (Book book: this.books) {
            hash = hash * 31 + this.hashCode();
        }
        return hash;
    }
}
