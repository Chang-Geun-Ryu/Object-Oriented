package academy.pocu.comp2500.assignment2;

public class BusinessCard extends Option {
    protected Type type;
//    protected BusinessCardSide side;

    protected BusinessCard(Type businessCardType, BusinessCardSide businessCardSides, OrientationType orientation, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(orientation);
        this.side = businessCardSides;
        this.type = businessCardType;
        setName(businessCardType.getNameCard());
        setPrice(businessCardType.getPrice() + businessCardSides.getAddPrice());
        setShippingOption(deliveryMethod);
        setWidth(businessCardType.getWidth());
        setHeight(businessCardType.getHeight());
        setColor(businessCardColor.getColor());
    }

    public Type getType() {
        return type;
    }

}