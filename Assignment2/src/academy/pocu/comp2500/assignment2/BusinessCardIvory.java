package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCardIvory extends BusinessCard {
    public BusinessCardIvory(BusinessCardType type, BusinessCardSide sides, OrientationType orientation, ShippingOptionsType deliveryMethod, ArrayList<TextAperture> textAperture, ArrayList<ImageAperture> imageAperture) {
        super(type, sides, orientation, BusinessCardColor.IVORY, deliveryMethod, textAperture, imageAperture);
    }
}
