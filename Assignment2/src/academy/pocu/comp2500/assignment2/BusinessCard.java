package academy.pocu.comp2500.assignment2;

public class BusinessCard extends Option {
    protected Type type;
//    protected BusinessCardColor color;
    protected BusinessCardSide side;
    protected BusinessCard(Type type, BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionType deliveryMethod) {
        super(orientation);
        this.side = sides;
        this.type = type;
        setName(type.getNameCard());
        setPrice(type.getPrice() + sides.getAddPrice());
        setShippingOption(deliveryMethod);
        setWidth(type.getWidth());
        setHeight(type.getHeight());

        setColor(color.getColor());
    }

    public BusinessCardSide getSide() {
        return this.side;
    }

    public Type getBusinessType() {
        return type;
    }

}