package academy.pocu.comp2500.assignment2;

public class BusinessCardDoubleSided extends BusinessCard {
    public BusinessCardDoubleSided(BusinessCardType type, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(type, Side.DOUBLE, orientation, color, deliveryMethod);

    }
}
