package academy.pocu.comp2500.assignment2;

public class BusinessCardLandscape extends BusinessCard {
    public BusinessCardLandscape(BusinessCardType type, BusinessCardSide sides, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(type, sides, OrientationType.LANDSCAPE, color, deliveryMethod);
    }
}
