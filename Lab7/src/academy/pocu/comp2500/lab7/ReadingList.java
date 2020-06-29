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

    private boolean equalBooks(ReadingList list) {
        if (this.books.size() != list.books.size()) {
            return false;
        }

        int index = -1;
        for (Book book : this.books) {
            if (list.books.get(++index).hashCode() != book.hashCode()) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (Book book: this.books) {
            result.append(++index);
            result.append(". ");
            result.append(book.toString());
            result.append(System.lineSeparator());
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof ReadingList)) return false;
        ReadingList that = (ReadingList) o;
        return this.name.equals(that.name) &&
                this.books.equals(that.books) &&
                this.books.hashCode() == that.books.hashCode() &&
                equalBooks(that);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = hash * 31 + name.hashCode();
        for (Book book: this.books) {
            hash = hash * 31 + book.hashCode();
        }
        return hash;
    }
}
