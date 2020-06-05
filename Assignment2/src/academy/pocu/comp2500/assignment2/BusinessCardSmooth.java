package academy.pocu.comp2500.assignment2;

public class BusinessCardSmooth extends BusinessCard {
    public BusinessCardSmooth(BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(BusinessCardType.SMOOTH, sides, orientation, color, deliveryMethod);
    }
}
