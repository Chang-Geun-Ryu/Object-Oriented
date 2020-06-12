package academy.pocu.comp2500.assignment2;

public class BusinessCardSingleSided extends BusinessCard {
    public BusinessCardSingleSided(BusinessCardType businessCardType, OrientationType orientation, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(businessCardType, Sides.SINGLE, orientation, businessCardColor, deliveryMethod);
    }
}
