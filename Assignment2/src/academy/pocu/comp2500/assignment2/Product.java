package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Product {
    private String name;
    private String size;
    private int price;
    private int color;
    private int width;
    private int height;
    private ShippingOptionsType shippingOptions;


    public Product(String size, int color, int price, ShippingOptionsType deliveryMethod) {
        this.name = "Product";
        this.size = size;
        this.color = color;
        this.price = price;
        this.shippingOptions = deliveryMethod;
    }

    public String getName() {
        return this.name;
    }

    public String getSize() {
        return this.size;
    }

    public int getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;// + (this.texts.size() + this.imagePaths.size()) * 5;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public ShippingOptionsType getShippingOptions() {
        return this.shippingOptions;
    }

    protected void setSize(String size) {
        this.size = size;
    }

    protected void setColor(int color) {
        this.color = color;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height) {
        this.height = height;
    }
}
