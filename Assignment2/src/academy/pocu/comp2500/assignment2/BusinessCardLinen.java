package academy.pocu.comp2500.assignment2;

public class BusinessCardLinen extends BusinessCard {
    public BusinessCardLinen(BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(BusinessCardType.LINEN, sides, orientation, color, deliveryMethod);
    }

//    public BusinessCardSide getSide() {
//        return this.side;
//    }

//    public BusinessCardColor getColor() {
//        return this.color;
//    }

//    public OrientationType getOrientation() {
//        return this.orientation;
//    }
}
