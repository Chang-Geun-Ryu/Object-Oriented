package academy.pocu.comp2500.assignment2;

public class BusinessCard extends Option {

    protected BusinessCard(Type type, BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super(orientation);
        this.side = sides;
        this.type = type;
        setName(type.getNameCard());
        setPrice(type.getPrice() + sides.getAddPrice());
        setShippingOptions(deliveryMethod);
        setWidth(type.getWidth());
        setHeight(type.getHeight());

        setColor(color.getColor());
    }

    public Type getType() {
        return type;
    }
}