package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCardPortrait extends BusinessCard {
    public BusinessCardPortrait(BusinessCardType type, BusinessCardSide sides, BusinessCardColor color, ShippingOptionsType deliveryMethod, ArrayList<TextAperture> textAperture, ArrayList<ImageAperture> imageAperture) {
        super(type, sides, OrientationType.PORTRAIT, color, deliveryMethod, textAperture, imageAperture);
    }
}
