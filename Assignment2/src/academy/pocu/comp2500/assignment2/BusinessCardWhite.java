package academy.pocu.comp2500.assignment2;

public class BusinessCardWhite extends BusinessCard {

    public BusinessCardWhite(BusinessCardType type, Side sides, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(type, sides, orientation, BusinessCardColor.WHITE, deliveryMethod);
    }
}
