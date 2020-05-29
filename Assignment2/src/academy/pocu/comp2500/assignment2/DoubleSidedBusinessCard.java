package academy.pocu.comp2500.assignment2;

public class DoubleSidedBusinessCard extends BusinessCard {
    public DoubleSidedBusinessCard(BusinessCardType businessCardType, OrientationType businessCardOrientation, BusinessCardColor businessCardColor) {
        super(businessCardType, BusinessCardSide.DOUBLE, businessCardOrientation, businessCardColor);
    }
}
