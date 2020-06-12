package academy.pocu.comp2500.assignment2;

public class BusinessCardPortrait extends BusinessCard {
    public BusinessCardPortrait(Type businessCardType, BusinessCardSide sides, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(businessCardType, sides, OrientationType.PORTRAIT, businessCardColor, deliveryMethod);
    }
}
