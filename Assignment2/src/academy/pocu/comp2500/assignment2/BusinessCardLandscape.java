package academy.pocu.comp2500.assignment2;

public class BusinessCardLandscape extends BusinessCard {
    public BusinessCardLandscape(BusinessCardType type, BusinessCardSide sides, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(type, sides, OrientationType.LANDSCAPE, color, deliveryMethod);
    }

//    public BusinessCardSide getSide() {
//        return this.side;
//    }
//
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
