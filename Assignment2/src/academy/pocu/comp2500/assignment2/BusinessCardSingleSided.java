package academy.pocu.comp2500.assignment2;

public class BusinessCardSingleSided extends BusinessCard {
    public BusinessCardSingleSided(Type type, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(type, BusinessCardSide.SINGLE, orientation, color, deliveryMethod);
    }
}
