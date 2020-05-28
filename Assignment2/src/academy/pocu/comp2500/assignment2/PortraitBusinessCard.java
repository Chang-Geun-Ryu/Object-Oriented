package academy.pocu.comp2500.assignment2;

public class PortraitBusinessCard extends BusinessCard {
    public PortraitBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, BusinessCardColor businessCardColor) {
        super(businessCardType, businessCardSides, OrientationType.PORTRAIT, businessCardColor);
    }
}
