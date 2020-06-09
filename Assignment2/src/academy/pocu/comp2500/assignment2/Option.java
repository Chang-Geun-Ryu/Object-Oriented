package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Option extends Product {
    private OrientationType orientation;
    private BusinessCardSide side;
    private ArrayList<TextAperture> texts;
    private ArrayList<ImageAperture> imagePaths;

    protected Option(OrientationType orientation, BusinessCardSide side) {
        this.orientation = orientation;
        this.side = side;
        this.texts = new ArrayList<>();
        this.imagePaths = new ArrayList<>();
    }

    public BusinessCardSide getSide() {
        return this.side;
    }

    public OrientationType getOrientation() {
        return this.orientation;
    }

    protected void setSide(BusinessCardSide side) {
        this.side = side;
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
