package academy.pocu.comp2500.assignment2;

public class BusinessCardDoubleSided extends BusinessCard {
    public BusinessCardDoubleSided(Type businessCardType, OrientationType orientation, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(businessCardType, BusinessCardSide.DOUBLE, orientation, businessCardColor, deliveryMethod);
    }
}
