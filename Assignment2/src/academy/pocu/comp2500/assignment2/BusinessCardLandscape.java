package academy.pocu.comp2500.assignment2;

public class BusinessCardLandscape extends BusinessCard {
    public BusinessCardLandscape(Type businessCardType, BusinessCardSide sides, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(businessCardType, sides, OrientationType.LANDSCAPE, businessCardColor, deliveryMethod);
    }
}
