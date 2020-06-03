package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Product {
    private String name;
    private int price;
    private int color;
    private ShippingOptionsType shippingOptions;

    public Product(int color, int price, ShippingOptionsType deliveryMethod) {
        this.name = "Product";
        this.color = color;
        this.price = price;
        this.shippingOptions = deliveryMethod;
    }

    public String getName() {
        return this.name;
    }

    public int getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;// + (this.texts.size() + this.imagePaths.size()) * 5;
    }

    public ShippingOptionsType getShippingOptions() {
        return this.shippingOptions;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
