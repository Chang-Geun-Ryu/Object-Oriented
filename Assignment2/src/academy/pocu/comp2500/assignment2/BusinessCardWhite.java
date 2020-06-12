package academy.pocu.comp2500.assignment2;

public class BusinessCardWhite extends BusinessCard {

    public BusinessCardWhite(BusinessCardType businessCardType, Sides businessCardSides, OrientationType orientation, ShippingOptionType deliveryMethod) {
        super(businessCardType, businessCardSides, orientation, BusinessCardColor.WHITE, deliveryMethod);
    }
}
