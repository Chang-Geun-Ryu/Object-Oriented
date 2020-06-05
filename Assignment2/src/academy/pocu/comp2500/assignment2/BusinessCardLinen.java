package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCardLinen extends BusinessCard {
    public BusinessCardLinen(BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod, ArrayList<TextAperture> textAperture, ArrayList<ImageAperture> imageAperture) {
        super(BusinessCardType.LINEN, sides, orientation, color, deliveryMethod, textAperture, imageAperture);
    }
}
