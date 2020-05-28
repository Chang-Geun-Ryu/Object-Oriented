package academy.pocu.comp2500.assignment2;

public class LinenBusinessCard extends BusinessCard {
    public LinenBusinessCard(BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor) {
        super(BusinessCardType.Linen, businessCardSides, businessCardOrientation, businessCardColor);
    }

    @Override
    public void addText(String text) {
        super.addText(text);
    }

    @Override
    public void addImagePath(String imagePath) {
        super.addImagePath(imagePath);
    }
}
