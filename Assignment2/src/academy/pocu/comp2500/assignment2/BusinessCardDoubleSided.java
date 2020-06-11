package academy.pocu.comp2500.assignment2;

public class BusinessCardDoubleSided extends BusinessCard {
    public BusinessCardDoubleSided(BusinessCardType type, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(type, BusinessCardSide.DOUBLE, orientation, color, deliveryMethod);
    }

//    public BusinessCardSide getSide() {
//        return this.side;
//    }

//    public BusinessCardType getType() {
//        return this.type;
//    }

//    public BusinessCardColor getColor() {
//        return this.color;
//    }

//    public OrientationType getOrientation() {
//        return this.orientation;
//    }
}
