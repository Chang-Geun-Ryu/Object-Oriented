package academy.pocu.comp2500.assignment2;

public class BusinessCardGray extends BusinessCard {
    public BusinessCardGray(Type type, BusinessCardSide sides, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(type, sides, orientation, BusinessCardColor.GRAY, deliveryMethod);
    }
}
