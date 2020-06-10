package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Option extends Product {
    private OrientationType orientation;
    private ArrayList<Aperture> apertures;
//    private ArrayList<Aperture> imagePaths;
    private int width;
    private int height;

    protected Option(OrientationType orientation) {
        this.orientation = orientation;
        this.apertures = new ArrayList<>();
//        this.imagePaths = new ArrayList<>();
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public OrientationType getOrientation() {
        return this.orientation;
    }

//    public ArrayList<Aperture> getImagePaths() {
//        return this.imagePaths;
//    }

//    public ArrayList<Aperture> getTexts() {
//        return this.texts;
//    }

    public ArrayList<Aperture> getApertures() {
        return this.apertures;
    }

    public void addAperture(Aperture aperture) {
//        this.texts.add(textAperture);
        this.apertures.add(aperture);
        addPrice(aperture);
    }

//    public void addImage(Aperture imageAperture) {
//        this.imagePaths.add(imageAperture);
//        addPrice(imageAperture);
//    }

    private void addPrice(Aperture aperture) {
        int w = this.orientation == OrientationType.LANDSCAPE ? this.width : this.height;
        int h = this.orientation == OrientationType.LANDSCAPE ? this.height : this.width;

        if (aperture.getX() >= 0 && aperture.getY() >= 0 &&
        aperture.getX() < w && aperture.getY() < h) {
            setPrice(getPrice() + 5);
        }
    }
}
