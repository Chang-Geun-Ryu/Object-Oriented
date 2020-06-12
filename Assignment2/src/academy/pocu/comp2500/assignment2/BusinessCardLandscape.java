package academy.pocu.comp2500.assignment2;

public class BusinessCardLandscape extends BusinessCard {
    public BusinessCardLandscape(BusinessCardType businessCardType, Sides businessCardSides, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(businessCardType, businessCardSides, OrientationType.LANDSCAPE, businessCardColor, deliveryMethod);
    }
}
