package academy.pocu.comp2500.assignment2;

public class Product {
    private String name;
    private int price;
    private ShippingOptionsType shippingOptions;
    private int color;

    protected Product() {
        this.name = "";
        this.price = 0;
        this.shippingOptions = ShippingOptionsType.PICKUP;
        this.color = 0;
    }

    public int getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;// + (this.texts.size() + this.imagePaths.size()) * 5;
    }

    public ShippingOptionsType getShippingOptions() {
        return this.shippingOptions;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShippingOptions(ShippingOptionsType type) {
        this.shippingOptions = type;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
