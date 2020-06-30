package academy.pocu.comp2500.lab7;

import java.util.ArrayList;

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
        if (o == null || !(o instanceof ReadingList) || hashCode() != o.hashCode()) return false;
        ReadingList that = (ReadingList) o;
        return this.name.equals(that.name) &&
                equalBooks(that);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = hash * 31 + name.hashCode();
        hash = hash * 31 + this.books.hashCode();
        return hash;
    }
}
