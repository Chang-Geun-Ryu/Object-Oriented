package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCardDoubleSided extends BusinessCard {
    public BusinessCardDoubleSided(BusinessCardType type, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod, ArrayList<TextAperture> textAperture, ArrayList<ImageAperture> imageAperture) {
        super(type, BusinessCardSide.DOUBLE, orientation, color, deliveryMethod, textAperture, imageAperture);
    }
}
