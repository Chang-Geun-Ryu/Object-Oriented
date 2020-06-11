package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCard extends Option {
    protected BusinessCardType type;
    protected BusinessCardColor color;
    protected BusinessCardSide side;

    protected BusinessCard(BusinessCardType type, BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(orientation);
        this.side = sides;
        this.type = type;
        this.color = color;
        setName(type.getName());
        setPrice(type.getPrice() + sides.getAddPrice());
        setShippingOptions(deliveryMethod);
        setWidth(type.getWidth());
        setHeight(type.getHeight());

        setColor(color.getColor());
//        setColor(color.getColor());
    }

//    protected void setSide(BusinessCardSide side) {
//        this.side = side;
//    }
    public BusinessCardSide getSide() {
        return this.side;
    }

    public BusinessCardType getType() {
        return this.type;
    }

//    public BusinessCardColor getColor() {
//        return this.color;
//    }

//    public int getWidth() {
//        return 90;
//    }
//
//    public int getHeight() {
//        return 50;
//    }

//    protected void setType(BusinessCardType type) {
//        this.type = type;
//    }
//
//    protected void setColor(BusinessCardColor color) {
//        this.color = color;
//    }

}