package academy.pocu.comp2500.assignment2;

public class BusinessCardSingleSided extends BusinessCard {
    public BusinessCardSingleSided(Type businessCardType, OrientationType orientation, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(businessCardType, BusinessCardSide.SINGLE, orientation, businessCardColor, deliveryMethod);
    }
}
