package academy.pocu.comp2500.assignment2;

public class BusinessCardGray extends BusinessCard {
    public BusinessCardGray(Type businessCardType, BusinessCardSide businessCardSides, OrientationType orientation, ShippingOptionType deliveryMethod) {
        super(businessCardType, businessCardSides, orientation, BusinessCardColor.GRAY, deliveryMethod);
    }
}
