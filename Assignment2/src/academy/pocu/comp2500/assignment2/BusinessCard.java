package academy.pocu.comp2500.assignment2;

public class BusinessCard extends Option {
    protected Type type;
    protected BusinessCardSide side;

    protected BusinessCard(Type businessCardType, BusinessCardSide businessCardSides, OrientationType orientation, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(orientation);
        this.side = businessCardSides;
        this.type = businessCardType;
        setName(type.getNameCard());
        setPrice(type.getPrice() + businessCardSides.getAddPrice());
        setShippingOption(deliveryMethod);
        setWidth(type.getWidth());
        setHeight(type.getHeight());
        setColor(businessCardColor.getColor());
    }

    public BusinessCardSide getSide() {
        return this.side;
    }

    public Type getType() {
        return type;
    }

}