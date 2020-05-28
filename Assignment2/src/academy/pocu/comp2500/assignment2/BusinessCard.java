package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCard extends Product {
    private BusinessCardSide side;
    private OrientationType orientation;
    private ArrayList<String> texts;
    private ArrayList<String> imagePaths;

    public BusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor) {
        super(businessCardType.getName(), "90 mm x 50 mm", businessCardColor.getColor(), businessCardType.getPrice() + businessCardSides.getAddPrice());
        this.side = businessCardSides;
        this.orientation = businessCardOrientation;

        setWidth(businessCardType.getWidth());
        setHeight(businessCardType.getHeight());
    }

    public ArrayList<String> getImagePaths() {
        return imagePaths;
    }

    public ArrayList<String> getTexts() {
        return texts;
    }

    public int getPrice() {
        return super.getPrice() + (this.texts.size() + this.imagePaths.size()) * 5;
    }

    public void addText(String text) {
        this.texts.add(text);
    }

    public void addImagePath(String imagePath) {
        this.imagePaths.add(imagePath);
    }
}