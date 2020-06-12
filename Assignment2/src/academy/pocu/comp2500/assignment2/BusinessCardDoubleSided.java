package academy.pocu.comp2500.assignment2;

public class BusinessCardDoubleSided extends BusinessCard {
    public BusinessCardDoubleSided(BusinessCardType businessCardType, OrientationType orientation, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(businessCardType, Sides.DOUBLE, orientation, businessCardColor, deliveryMethod);
    }
}
