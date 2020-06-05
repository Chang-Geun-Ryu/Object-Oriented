package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCardLaid extends BusinessCard {
    public BusinessCardLaid(BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod, ArrayList<TextAperture> textAperture, ArrayList<ImageAperture> imageAperture) {
        super(BusinessCardType.LAID, sides, orientation, color, deliveryMethod, textAperture, imageAperture);
    }
}
