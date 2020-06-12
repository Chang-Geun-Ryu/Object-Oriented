package academy.pocu.comp2500.assignment2;

public class BusinessCardLinen extends BusinessCard {
    public BusinessCardLinen(BusinessCardSide businessCardSides, OrientationType orientation, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(Type.LINEN, businessCardSides, orientation, businessCardColor, deliveryMethod);
    }
}
