package academy.pocu.comp2500.assignment2;

public class BusinessCardIvory extends BusinessCard {
    public BusinessCardIvory(BusinessCardType type, BusinessCardSide sides, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(type, sides, orientation, BusinessCardColor.IVORY, deliveryMethod);
    }
}
