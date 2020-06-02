package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCard extends Product {
    private BusinessCardSide side;
    private OrientationType orientation;

    private ArrayList<TextAperture> texts;
    private ArrayList<ImageAperture> imagePaths;

    public BusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor) {
        super("90 mm x 50 mm", businessCardColor.getColor(), businessCardType.getPrice() + businessCardSides.getAddPrice());
        this.side = businessCardSides;
        this.orientation = businessCardOrientation;

        setWidth(businessCardType.getWidth());
        setHeight(businessCardType.getHeight());
    }

    public ArrayList<ImageAperture> getImagePaths() {
        return this.imagePaths;
    }

    public ArrayList<TextAperture> getTexts() {
        return this.texts;
    }

    public void addText(TextAperture textAperture) {
        this.texts.add(textAperture);
    }

    public void addImage(ImageAperture imageAperture) {
        this.imagePaths.add(imageAperture);
    }
}

final class LandscapeBusinessCard extends BusinessCard {
    public LandscapeBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, BusinessCardColor businessCardColor) {
        super(businessCardType, businessCardSides, OrientationType.LANDSCAPE, businessCardColor);
    }
}

final class WhiteBusinessCard extends BusinessCard {
    public WhiteBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, OrientationType businessCardOrientation) {
        super(businessCardType, businessCardSides, businessCardOrientation, BusinessCardColor.WHITE);
    }
}

final class LaidBusinessCard extends BusinessCard {
    public LaidBusinessCard(BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor) {
        super(BusinessCardType.LAID, businessCardSides, businessCardOrientation, businessCardColor);
    }
}

final class DoubleSidedBusinessCard extends BusinessCard {
    public DoubleSidedBusinessCard(BusinessCardType businessCardType, OrientationType businessCardOrientation, BusinessCardColor businessCardColor) {
        super(businessCardType, BusinessCardSide.DOUBLE, businessCardOrientation, businessCardColor);
    }
}

final class SmoothBusinessCard extends BusinessCard {
    public SmoothBusinessCard(BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor) {
        super(BusinessCardType.SMOOTH, businessCardSides, businessCardOrientation, businessCardColor);
    }
}

final class IvoryBusinessCard extends BusinessCard {
    public IvoryBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, OrientationType businessCardOrientation) {
        super(businessCardType, businessCardSides, businessCardOrientation, BusinessCardColor.IVORY);
    }
}

final class GrayBusinessCard extends BusinessCard {
    public GrayBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, OrientationType businessCardOrientation) {
        super(businessCardType, businessCardSides, businessCardOrientation, BusinessCardColor.GRAY);
    }
}

final class PortraitBusinessCard extends BusinessCard {
    public PortraitBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, BusinessCardColor businessCardColor) {
        super(businessCardType, businessCardSides, OrientationType.PORTRAIT, businessCardColor);
    }
}

final class SingleSidedBusinessCard extends BusinessCard {
    public SingleSidedBusinessCard(BusinessCardType businessCardType, OrientationType businessCardOrientation, BusinessCardColor businessCardColor) {
        super(businessCardType, BusinessCardSide.SINGLE, businessCardOrientation, businessCardColor);
    }
}

final class LinenBusinessCard extends BusinessCard {
    public LinenBusinessCard(BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor) {
        super(BusinessCardType.LINEN, businessCardSides, businessCardOrientation, businessCardColor);
    }
}
