package academy.pocu.comp2500.assignment2;

public class BusinessCardWhite extends BusinessCard {

    public BusinessCardWhite(Type businessCardType, BusinessCardSide businessCardSides, OrientationType orientation, ShippingOptionType deliveryMethod) {
        super(businessCardType, businessCardSides, orientation, BusinessCardColor.WHITE, deliveryMethod);
    }
}
