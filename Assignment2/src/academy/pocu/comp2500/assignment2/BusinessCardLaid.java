package academy.pocu.comp2500.assignment2;

public class BusinessCardLaid extends BusinessCard {
    public BusinessCardLaid(Side sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(BusinessCardType.LAID, sides, orientation, color, deliveryMethod);
    }
}
