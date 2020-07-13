package academy.pocu.comp2500.lab9;

import java.util.ArrayList;
import java.util.UUID;

public final class Cart {
    private ArrayList<Book> books = new ArrayList<>();

    public Book getBookOrNull(int index) {
        if (this.books.size() <= index) {
            return null;
        }

        return this.books.get(index);
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBooks(final ArrayList<Book> books) {
        for (Book b : books) {
            addBook(b);
        }
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean remove(int index) {
        if (this.books.size() <= index) {
            return false;
        }

        this.books.remove(index);

        return true;
    }

    public int getTotalPrice() {
        return new SimplePricing().getTotalPrice(this.books);
    }

    public int getTotalPrice(IPriceable pricingModel) {
        return pricingModel.getTotalPrice(this.books);
    }
}
/*
public final class Cart {
    private ArrayList<Book> books = new ArrayList<>();
    private IPriceable pricingModel;

    public void setPricing(IPriceable pricingModel) {
        this.pricingModel = pricingModel;
    }

    public Book getBookOrNull(int index) {
        if (this.books.size() <= index) {
            return null;
        }

        return this.books.get(index);
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBooks(final ArrayList<Book> books) {
        for (Book b : books) {
            addBook(b);
        }
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean remove(int index) {
        if (this.books.size() <= index) {
            return false;
        }

        this.books.remove(index);

        return true;
    }

    public int getTotalPrice() {
        if (this.pricingModel == null) {
            this.pricingModel = new SimplePricing();
            return this.pricingModel.getTotalPrice(this.books);
        } else {
            return this.pricingModel.getTotalPrice(this.books);
        }
    }
}*/