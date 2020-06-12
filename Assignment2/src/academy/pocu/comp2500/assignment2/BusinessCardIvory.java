package academy.pocu.comp2500.assignment2;

public class BusinessCardIvory extends BusinessCard {
    public BusinessCardIvory(BusinessCardType businessCardType, Sides businessCardSides, OrientationType orientation, ShippingOptionType deliveryMethod) {
        super(businessCardType, businessCardSides, orientation, BusinessCardColor.IVORY, deliveryMethod);
    }
}
