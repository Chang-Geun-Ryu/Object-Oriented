package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCard extends Option {
    private BusinessCardSide side;
    private BusinessCardType type;
    private BusinessCardColor color;

//    private ArrayList<TextAperture> texts;
//    private ArrayList<ImageAperture> imagePaths;

    protected BusinessCard(BusinessCardType type, BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(orientation);
        this.side = sides;
        this.type = type;
        this.color = color;
        setName(type.getName());
        setPrice(type.getPrice() + sides.getAddPrice());
        setShippingOptions(deliveryMethod);

//        this.texts = new ArrayList<>();
//        this.imagePaths = new ArrayList<>();
    }

//    public ArrayList<ImageAperture> getImagePaths() {
//        return this.imagePaths;
//    }
//
//    public ArrayList<TextAperture> getTexts() {
//        return this.texts;
//    }

    public BusinessCardSide getSide() {
        return this.side;
    }

    public BusinessCardType getType() {
        return this.type;
    }

    public BusinessCardColor getColor() {
        return this.color;
    }

//    public OrientationType getOrientation() {
//        return this.orientation;
//    }

    public int getWidth() {
        return 90;
    }

    public int getHeight() {
        return 50;
    }

//    public void addText(TextAperture textAperture) {
//        this.texts.add(textAperture);
//        setPrice(getPrice() + 5);
//    }
//
//    public void addImage(ImageAperture imageAperture) {
//        this.imagePaths.add(imageAperture);
//        setPrice(getPrice() + 5);
//    }

    protected void setType(BusinessCardType type) {
        this.type = type;
    }

    protected void setSide(BusinessCardSide side) {
        this.side = side;
    }

    protected void setColor(BusinessCardColor color) {
        this.color = color;
    }

//    protected void setOrientation(OrientationType orientation) {
//        this.orientation = orientation;
//    }
}