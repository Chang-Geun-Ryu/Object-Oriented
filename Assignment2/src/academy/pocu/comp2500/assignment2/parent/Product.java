package academy.pocu.comp2500.assignment2.parent;

import academy.pocu.comp2500.assignment2.ShippingOptionsType;

import java.util.ArrayList;

public class Product {
    private String name;
    private int price;
    private ShippingOptionsType shippingOptions;

    protected Product() {
        this.name = "";
        this.price = 0;
        this.shippingOptions = ShippingOptionsType.PICKUP;
    }
//    public Product(int color, int price, ShippingOptionsType deliveryMethod) {
//        this.name = "Product";
//        this.color = color;
//        this.price = price;
//        this.shippingOptions = deliveryMethod;
//    }

    public String getName() {
        return this.name;
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

    protected void setShippingOptions(ShippingOptionsType type) {
        this.shippingOptions = type;
    }
}
