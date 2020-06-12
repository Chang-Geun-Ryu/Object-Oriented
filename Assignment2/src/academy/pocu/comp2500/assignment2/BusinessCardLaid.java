package academy.pocu.comp2500.assignment2;

public class BusinessCardLaid extends BusinessCard {
    public BusinessCardLaid(Sides businessCardSides, OrientationType orientation, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(BusinessCardType.LAID, businessCardSides, orientation, businessCardColor, deliveryMethod);
    }
}
