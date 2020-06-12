package academy.pocu.comp2500.assignment2;

public class BusinessCardLinen extends BusinessCard {
    public BusinessCardLinen(BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(Type.LINEN, sides, orientation, color, deliveryMethod);
    }
}
