package academy.pocu.comp2500.assignment2;

public class BusinessCardPortrait extends BusinessCard {
    public BusinessCardPortrait(BusinessCardType businessCardType, Sides sides, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(businessCardType, sides, OrientationType.PORTRAIT, businessCardColor, deliveryMethod);
    }
}
