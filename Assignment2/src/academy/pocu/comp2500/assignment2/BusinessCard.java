package academy.pocu.comp2500.assignment2;

public class BusinessCard extends Product {
    private BusinessCardSide side;
    private OrientationType orientation;

    public BusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor) {
        super("90 mm x 50 mm", businessCardColor.getColor(), businessCardType.getPrice() + businessCardSides.getAddPrice());
        this.side = businessCardSides;
        this.orientation = businessCardOrientation;

        setWidth(businessCardType.getWidth());
        setHeight(businessCardType.getHeight());
    }

}