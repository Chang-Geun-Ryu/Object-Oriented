package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCardGray extends BusinessCard {
    public BusinessCardGray(BusinessCardType type, BusinessCardSide sides, OrientationType orientation, ShippingOptionsType deliveryMethod, ArrayList<TextAperture> textAperture, ArrayList<ImageAperture> imageAperture) {
        super(type, sides, orientation, BusinessCardColor.GRAY, deliveryMethod, textAperture, imageAperture);
    }
}
