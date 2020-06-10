package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCard extends Option {
    private BusinessCardType type;
    private BusinessCardColor color;
    protected Side doubleSide;

    protected BusinessCard(BusinessCardType type, Side sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(orientation);//, sides);
        this.doubleSide = sides;
        this.type = type;
        this.color = color;
        setName(type.getName());
        setPrice(type.getPrice() + sides.getAddPrice());
        setShippingOptions(deliveryMethod);
        setWidth(type.getWidth());
        setHeight(type.getHeight());
    }

    public Side getSide() {
        return this.doubleSide;
    }

    public BusinessCardType getType() {
        return this.type;
    }

    public BusinessCardColor getColor() {
        return this.color;
    }
}