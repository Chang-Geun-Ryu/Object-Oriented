package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Option extends Product {
    private OrientationType orientation;
    private ArrayList<Aperture> texts;
    private ArrayList<Aperture> imagePaths;
//    protected Side doubleSide;
    private int width;
    private int height;
//    private int color;

    protected Option(OrientationType orientation) {
        this.orientation = orientation;
        this.texts = new ArrayList<>();
        this.imagePaths = new ArrayList<>();
//        this.doubleSide = sides;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

//    protected void setColor(int color) {
//        this.color = color;
//    }

//    public int getColor() {
//        return this.color;
//    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public OrientationType getOrientation() {
        return this.orientation;
    }

    public ArrayList<Aperture> getImagePaths() {
        return this.imagePaths;
    }

    public ArrayList<Aperture> getTexts() {
        return this.texts;
    }

    public void addText(Aperture textAperture) {
        this.texts.add(textAperture);
        addPrice(textAperture);
//        setPrice(getPrice() + 5);
    }

    public void addImage(Aperture imageAperture) {
        this.imagePaths.add(imageAperture);
        addPrice(imageAperture);
//        setPrice(getPrice() + 5);
    }

    private void addPrice(Aperture aperture) {
        int w = this.orientation == OrientationType.LANDSCAPE ? this.width : this.height;
        int h = this.orientation == OrientationType.LANDSCAPE ? this.height : this.width;

        if (aperture.getX() >= 0 && aperture.getY() >= 0 &&
        aperture.getX() < w && aperture.getY() < h) {
            setPrice(getPrice() + 5);
        }
    }
}
