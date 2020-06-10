package academy.pocu.comp2500.assignment2;

public class BusinessCardSmooth extends BusinessCard {
    public BusinessCardSmooth(BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(BusinessCardType.SMOOTH, sides, orientation, color, deliveryMethod);
    }

    public BusinessCardSide getSide() {
        return this.side;
    }

//    public BusinessCardType getType() {
//        return this.type;
//    }

    public BusinessCardColor getColor() {
        return this.color;
    }

    public OrientationType getOrientation() {
        return this.orientation;
    }
}
