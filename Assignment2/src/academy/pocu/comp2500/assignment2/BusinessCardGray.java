package academy.pocu.comp2500.assignment2;

public class BusinessCardGray extends BusinessCard {
    public BusinessCardGray(BusinessCardType type, BusinessCardSide sides, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(type, sides, orientation, BusinessCardColor.GRAY, deliveryMethod);
    }
    public BusinessCardSide getSide() {
        return this.side;
    }

    public BusinessCardType getType() {
        return this.type;
    }

//    public BusinessCardColor getColor() {
//        return this.color;
//    }

    public OrientationType getOrientation() {
        return this.orientation;
    }
}
