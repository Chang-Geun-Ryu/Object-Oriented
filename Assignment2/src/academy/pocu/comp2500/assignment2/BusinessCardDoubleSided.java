package academy.pocu.comp2500.assignment2;

public class BusinessCardDoubleSided extends BusinessCard {
    public BusinessCardDoubleSided(Type type, OrientationType orientation, BusinessCardColor color, ShippingOptionType deliveryMethod) {
        super(type, BusinessCardSide.DOUBLE, orientation, color, deliveryMethod);
    }
}
