package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCardSingleSided extends BusinessCard {
    public BusinessCardSingleSided(BusinessCardType type, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod, ArrayList<TextAperture> textAperture, ArrayList<ImageAperture> imageAperture) {
        super(type, BusinessCardSide.SINGLE, orientation, color, deliveryMethod, textAperture, imageAperture);
    }
}
