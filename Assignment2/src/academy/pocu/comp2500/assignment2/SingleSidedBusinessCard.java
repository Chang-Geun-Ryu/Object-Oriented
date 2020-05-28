package academy.pocu.comp2500.assignment2;

public class SingleSidedBusinessCard extends BusinessCard {
    public SingleSidedBusinessCard(BusinessCardType businessCardType, OrientationType businessCardOrientation, BusinessCardColor businessCardColor) {
        super(businessCardType, BusinessCardSide.SINGLE, businessCardOrientation, businessCardColor);
    }
}
