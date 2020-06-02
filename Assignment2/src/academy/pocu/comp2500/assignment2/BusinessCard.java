package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCard extends Product {
    private BusinessCardSide side;
    private OrientationType orientation;

    private ArrayList<TextAperture> texts;
    private ArrayList<ImageAperture> imagePaths;

    public BusinessCard(BusinessCardType type, BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType delivery) {
        super(type.getName(), "90 mm x 50 mm", color.getColor(), type.getPrice() + sides.getAddPrice(), delivery);
        this.side = sides;
        this.orientation = orientation;

        setWidth(type.getWidth());
        setHeight(type.getHeight());
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
    public LandscapeBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, BusinessCardColor businessCardColor, ShippingOptionsType delivery) {
        super(businessCardType, businessCardSides, OrientationType.LANDSCAPE, businessCardColor, delivery);
    }
}

final class WhiteBusinessCard extends BusinessCard {
    public WhiteBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, OrientationType businessCardOrientation, ShippingOptionsType delivery) {
        super(businessCardType, businessCardSides, businessCardOrientation, BusinessCardColor.WHITE, delivery);
    }
}

final class LaidBusinessCard extends BusinessCard {
    public LaidBusinessCard(BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor, ShippingOptionsType delivery) {
        super(BusinessCardType.LAID, businessCardSides, businessCardOrientation, businessCardColor, delivery);
    }
}

final class DoubleSidedBusinessCard extends BusinessCard {
    public DoubleSidedBusinessCard(BusinessCardType businessCardType, OrientationType businessCardOrientation, BusinessCardColor businessCardColor, ShippingOptionsType delivery) {
        super(businessCardType, BusinessCardSide.DOUBLE, businessCardOrientation, businessCardColor, delivery);
    }
}

final class SmoothBusinessCard extends BusinessCard {
    public SmoothBusinessCard(BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor, ShippingOptionsType delivery) {
        super(BusinessCardType.SMOOTH, businessCardSides, businessCardOrientation, businessCardColor, delivery);
    }
}

final class IvoryBusinessCard extends BusinessCard {
    public IvoryBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, OrientationType businessCardOrientation, ShippingOptionsType delivery) {
        super(businessCardType, businessCardSides, businessCardOrientation, BusinessCardColor.IVORY, delivery);
    }
}

final class GrayBusinessCard extends BusinessCard {
    public GrayBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, OrientationType businessCardOrientation, ShippingOptionsType delivery) {
        super(businessCardType, businessCardSides, businessCardOrientation, BusinessCardColor.GRAY, delivery);
    }
}

final class PortraitBusinessCard extends BusinessCard {
    public PortraitBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, BusinessCardColor businessCardColor, ShippingOptionsType delivery) {
        super(businessCardType, businessCardSides, OrientationType.PORTRAIT, businessCardColor, delivery);
    }
}

final class SingleSidedBusinessCard extends BusinessCard {
    public SingleSidedBusinessCard(BusinessCardType businessCardType, OrientationType businessCardOrientation, BusinessCardColor businessCardColor, ShippingOptionsType delivery) {
        super(businessCardType, BusinessCardSide.SINGLE, businessCardOrientation, businessCardColor, delivery);
    }
}

final class LinenBusinessCard extends BusinessCard {
    public LinenBusinessCard(BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor, ShippingOptionsType delivery) {
        super(BusinessCardType.LINEN, businessCardSides, businessCardOrientation, businessCardColor, delivery);
    }
}
