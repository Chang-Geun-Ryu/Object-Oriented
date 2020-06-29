package academy.pocu.comp2500.lab7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class ReadingList {
    private String name;
//    private LinkedHashSet<Book> books;
    private ArrayList<Book> books;

    public ReadingList(String name) {
        this.name = name;
        this.books = new ArrayList<>();//LinkedHashSet<>();//new ArrayList<>();
    }

    public boolean add(Book book) {
        return books.add(book);
    }

    public boolean remove(Book book) {
        return books.remove(book);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (Book book: this.books) {
            result.append(++index);
            result.append(". ");
            result.append(book.toString());
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof ReadingList)) return false;
        ReadingList that = (ReadingList) o;
        return this.name.equals(that.name) &&
                this.books.equals(that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books);
    }
}
