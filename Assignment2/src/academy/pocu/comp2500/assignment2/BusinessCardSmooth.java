package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCardSmooth extends BusinessCard {
    public BusinessCardSmooth(BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod, ArrayList<TextAperture> textAperture, ArrayList<ImageAperture> imageAperture) {
        super(BusinessCardType.SMOOTH, sides, orientation, color, deliveryMethod, textAperture, imageAperture);
    }
}
