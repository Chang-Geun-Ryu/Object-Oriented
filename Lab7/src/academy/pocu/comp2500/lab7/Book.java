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
        return title + " [" + author.toString() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return this.since == book.since &&
                this.title.equals(book.title) &&
                this.author.equals(book.author) &&
                genre == book.genre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash * 31 + (this.title == null ? 0 : this.title.hashCode());
        hash = hash * 31 + (this.author == null ? 0 : this.author.hashCode());
        hash = hash * 31 + this.since;
        hash = hash * 31 + (this.genre == null ? 0 : genre.hashCode());
        return hash;
    }
}

