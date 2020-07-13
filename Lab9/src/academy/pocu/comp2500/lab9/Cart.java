package academy.pocu.comp2500.lab9;

import java.util.ArrayList;
import java.util.UUID;

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

//    public boolean addBooks(final UUID[] skus, final String[] titles, final int[] prices, final int[] publishedYears) {
//        if (skus.length != titles.length || skus.length != prices.length || skus.length != publishedYears.length) {
//            return false;
//        }
//
//        for (int i = 0; i < skus.length; ++i) {
//            Book book = new Book(skus[i], titles[i], prices[i], publishedYears[i]);
//            this.books.add(book);
//        }
//
//        return true;
//    }

    public void addBooks(final ArrayList<Book> books) {
//        if (skus.length != titles.length || skus.length != prices.length || skus.length != publishedYears.length) {
//            return false;
//        }

//        for (int i = 0; i < skus.length; ++i) {
//            Book book = new Book(skus[i], titles[i], prices[i], publishedYears[i]);
//            this.books.add(book);
//        }
        for (Book b : books) {
            addBook(b);
        }
    }

//    public void addBook(final UUID sku, final String title, final int price, final int publishedYear) {
//        Book book = new Book(sku, title, price, publishedYear);
//        this.books.add(book);
//    }

    public void addBook(Book book) {
//        Book book = new Book(sku, title, price, publishedYear);
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
}