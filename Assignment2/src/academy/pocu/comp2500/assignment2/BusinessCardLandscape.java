package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCardLandscape extends BusinessCard {
    public BusinessCardLandscape(BusinessCardType type, BusinessCardSide sides, BusinessCardColor color, ShippingOptionsType deliveryMethod, ArrayList<TextAperture> textAperture, ArrayList<ImageAperture> imageAperture) {
        super(type, sides, OrientationType.LANDSCAPE, color, deliveryMethod, textAperture, imageAperture);
    }
}
