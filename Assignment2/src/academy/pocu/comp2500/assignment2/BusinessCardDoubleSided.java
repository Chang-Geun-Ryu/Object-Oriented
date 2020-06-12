package academy.pocu.comp2500.assignment2;

public class BusinessCardDoubleSided extends BusinessCard {
    public BusinessCardDoubleSided(Type businessCardType, OrientationType orientation, BusinessCardColor color, ShippingOptionType deliveryMethod) {
        super(businessCardType, BusinessCardSide.DOUBLE, orientation, color, deliveryMethod);
    }
}
