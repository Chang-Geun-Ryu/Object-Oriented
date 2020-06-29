package academy.pocu.comp2500.lab7;

import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int since;
    private Genre genre;

    public Book(String title, Author author, int since, Genre genre) {
        this.title = title;
        this.author = author;
        this.since = since;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title + "[" + author.toString() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return since == book.since &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, since, genre);
    }
}

