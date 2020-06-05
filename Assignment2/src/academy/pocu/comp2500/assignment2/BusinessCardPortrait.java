package academy.pocu.comp2500.assignment2;

public class BusinessCardPortrait extends BusinessCard {
    public BusinessCardPortrait(BusinessCardType type, BusinessCardSide sides, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(type, sides, OrientationType.PORTRAIT, color, deliveryMethod);
    }
}
