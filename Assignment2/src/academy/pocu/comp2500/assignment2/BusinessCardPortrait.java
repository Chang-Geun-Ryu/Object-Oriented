package academy.pocu.comp2500.assignment2;

public class BusinessCardPortrait extends BusinessCard {
    public BusinessCardPortrait(Type type, BusinessCardSide sides, BusinessCardColor color, ShippingOptionType deliveryMethod) {
        super(type, sides, OrientationType.PORTRAIT, color, deliveryMethod);
    }
}
