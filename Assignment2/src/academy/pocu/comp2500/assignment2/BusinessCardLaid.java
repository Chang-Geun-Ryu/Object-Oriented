package academy.pocu.comp2500.assignment2;

public class BusinessCardLaid extends BusinessCard {
    public BusinessCardLaid(BusinessCardSide businessCardSides, OrientationType orientation, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(Type.LAID, businessCardSides, orientation, businessCardColor, deliveryMethod);
    }
}
