package academy.pocu.comp2500.assignment2;

public class BusinessCardLaid extends BusinessCard {
    public BusinessCardLaid(BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(BusinessCardType.LAID, sides, orientation, color, deliveryMethod);
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
