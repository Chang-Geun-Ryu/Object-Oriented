package academy.pocu.comp2500.assignment2;

public class BusinessCardSmooth extends BusinessCard {
    public BusinessCardSmooth(Sides businessCardSides, OrientationType orientation, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(BusinessCardType.SMOOTH, businessCardSides, orientation, businessCardColor, deliveryMethod);
    }
}
