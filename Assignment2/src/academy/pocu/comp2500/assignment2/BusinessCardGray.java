package academy.pocu.comp2500.assignment2;

public class BusinessCardGray extends BusinessCard {
    public BusinessCardGray(BusinessCardType businessCardType, Sides businessCardSides, OrientationType orientation, ShippingOptionType deliveryMethod) {
        super(businessCardType, businessCardSides, orientation, BusinessCardColor.GRAY, deliveryMethod);
    }
}
