package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Product {
    private String name;
    private String size;
    private int price;
    private String color;
    private int width;
    private int height;

    private ArrayList<Aperture> texts;
    private ArrayList<Aperture> imagePaths;

    public Product(String size, String color, int price) {
        this.name = "";
        this.size = size;
        this.color = color;
        this.price = price;
        this.texts = new ArrayList<>();
        this.imagePaths = new ArrayList<>();
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
        return this.price + (this.texts.size() + this.imagePaths.size()) * 5;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public ArrayList<Aperture> getImagePaths() {
        return this.imagePaths;
    }

    public ArrayList<Aperture> getTexts() {
        return this.texts;
    }

    public void addText(String text, int x, int y, int width, int height) {
        this.texts.add(new Aperture(text, x, y, width, height));
    }

    public void addImage(String imagePath, int x, int y, int width, int height) {
        this.imagePaths.add(new Aperture(imagePath, x, y, width, height));
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
