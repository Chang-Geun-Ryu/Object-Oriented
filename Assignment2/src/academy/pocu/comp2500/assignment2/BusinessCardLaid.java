package academy.pocu.comp2500.assignment2;

public class BusinessCardLaid extends BusinessCard {
    public BusinessCardLaid(BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(Type.LAID, sides, orientation, color, deliveryMethod);
    }
}
