package academy.pocu.comp2500.assignment2;

public class BusinessCardSingleSided extends BusinessCard {
    public BusinessCardSingleSided(BusinessCardType type, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(type, BusinessCardSide.SINGLE, orientation, color, deliveryMethod);
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
