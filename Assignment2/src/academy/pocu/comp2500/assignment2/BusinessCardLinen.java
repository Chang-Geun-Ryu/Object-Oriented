package academy.pocu.comp2500.assignment2;

public class BusinessCardLinen extends BusinessCard {
    public BusinessCardLinen(Sides businessCardSides, OrientationType orientation, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(BusinessCardType.LINEN, businessCardSides, orientation, businessCardColor, deliveryMethod);
    }
}
