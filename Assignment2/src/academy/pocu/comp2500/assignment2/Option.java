package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Option extends Product {
    private OrientationType orientation;
    private ArrayList<Aperture> texts;
    private ArrayList<Aperture> imagePaths;
    private int width;
    private int height;

    protected Option(OrientationType orientation) {
        this.orientation = orientation;
        this.texts = new ArrayList<>();
        this.imagePaths = new ArrayList<>();
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height) {
        this.height = height;
    }

//    public int getWidth() {
//        return this.width;
//    }
//
//    public int getHeight() {
//        return this.height;
//    }

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
    }

    public void addImage(Aperture imageAperture) {
        this.imagePaths.add(imageAperture);
        addPrice(imageAperture);
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
