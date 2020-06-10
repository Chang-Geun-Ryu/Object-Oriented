package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Option extends Product {
    private OrientationType orientation;
    private ArrayList<TextAperture> texts;
    private ArrayList<ImageAperture> imagePaths;
    protected Side doubleSide;

    protected Option(OrientationType orientation, Side sides) {
        this.orientation = orientation;
        this.texts = new ArrayList<>();
        this.imagePaths = new ArrayList<>();
        this.doubleSide = sides;
    }

    public OrientationType getOrientation() {
        return this.orientation;
    }

    public ArrayList<ImageAperture> getImagePaths() {
        return this.imagePaths;
    }

    public ArrayList<TextAperture> getTexts() {
        return this.texts;
    }

    public void addText(TextAperture textAperture) {
        this.texts.add(textAperture);
        setPrice(getPrice() + 5);
    }

    public void addImage(ImageAperture imageAperture) {
        this.imagePaths.add(imageAperture);
        setPrice(getPrice() + 5);
    }
}
