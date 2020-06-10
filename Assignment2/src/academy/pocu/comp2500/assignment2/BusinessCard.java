package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCard extends Option {
    private BusinessCardType type;
    private BusinessCardColor color;

    protected BusinessCard(BusinessCardType type, Side sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(orientation, sides);
//        this.side = sides;
        this.type = type;
        this.color = color;
        setName(type.getName());
        setPrice(type.getPrice() + sides.getAddPrice());
        setShippingOptions(deliveryMethod);
    }

    protected void setSide(Side side) {
        super.doubleSide = side;
    }

    public Side getSide() {
        return super.doubleSide;
    }

    public BusinessCardType getType() {
        return this.type;
    }

    public BusinessCardColor getColor() {
        return this.color;
    }

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

    protected void setColor(BusinessCardColor color) {
        this.color = color;
    }

//    protected void setOrientation(OrientationType orientation) {
//        this.orientation = orientation;
//    }
}