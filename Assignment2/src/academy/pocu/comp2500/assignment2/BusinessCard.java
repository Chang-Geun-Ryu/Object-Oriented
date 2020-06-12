package academy.pocu.comp2500.assignment2;

public class BusinessCard extends Option {
    protected BusinessCardType businessCardType;
//    protected BusinessCardSide side;

    protected BusinessCard(BusinessCardType businessCardType, Sides businessCardSides, OrientationType orientation, BusinessCardColor businessCardColor, ShippingOptionType deliveryMethod) {
        super(orientation);
        this.sides = businessCardSides;
        this.businessCardType = businessCardType;
        setName(businessCardType.getNameCard());
        setPrice(businessCardType.getPrice() + businessCardSides.getAddPrice());
        setShippingOption(deliveryMethod);
        setWidth(businessCardType.getWidth());
        setHeight(businessCardType.getHeight());
        setColor(businessCardColor.getColor());
    }

    public BusinessCardType getType() {
        return businessCardType;
    }

}