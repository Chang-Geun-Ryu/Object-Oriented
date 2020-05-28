package academy.pocu.comp2500.assignment2;

public class Product {
    private String name;
    private String size;
    private int price;
    private String color;
    private int width;
    private int height;

    public Product(String size, String color, int price) {
        this.name = "";
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    protected void setSize(String size) {
        this.size = size;
    }

    protected void setColor(String color) {
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
