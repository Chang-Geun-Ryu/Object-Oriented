package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCard extends Product {
    private BusinessCardSide side;
    private OrientationType orientation;

    private ArrayList<TextAperture> texts;
    private ArrayList<ImageAperture> imagePaths;

    public BusinessCard(BusinessCardType type, BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
//        super("90 mm x 50 mm", color.getColor(), type.getPrice() + sides.getAddPrice(), deliveryMethod);
        super(color.getColor(), type.getPrice() + sides.getAddPrice(), deliveryMethod);
        this.side = sides;
        this.orientation = orientation;

        setWidth(type.getWidth());
        setHeight(type.getHeight());
        setName(type.getName());
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
    public LandscapeBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, BusinessCardColor businessCardColor, ShippingOptionsType deliveryMethod) {
        super(businessCardType, businessCardSides, OrientationType.LANDSCAPE, businessCardColor, deliveryMethod);
    }
}

final class WhiteBusinessCard extends BusinessCard {
    public WhiteBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, OrientationType businessCardOrientation, ShippingOptionsType deliveryMethod) {
        super(businessCardType, businessCardSides, businessCardOrientation, BusinessCardColor.WHITE, deliveryMethod);
    }
}

final class LaidBusinessCard extends BusinessCard {
    public LaidBusinessCard(BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor, ShippingOptionsType deliveryMethod) {
        super(BusinessCardType.LAID, businessCardSides, businessCardOrientation, businessCardColor, deliveryMethod);
    }
}

final class DoubleSidedBusinessCard extends BusinessCard {
    public DoubleSidedBusinessCard(BusinessCardType businessCardType, OrientationType businessCardOrientation, BusinessCardColor businessCardColor, ShippingOptionsType deliveryMethod) {
        super(businessCardType, BusinessCardSide.DOUBLE, businessCardOrientation, businessCardColor, deliveryMethod);
    }
}

final class SmoothBusinessCard extends BusinessCard {
    public SmoothBusinessCard(BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor, ShippingOptionsType deliveryMethod) {
        super(BusinessCardType.SMOOTH, businessCardSides, businessCardOrientation, businessCardColor, deliveryMethod);
    }
}

final class IvoryBusinessCard extends BusinessCard {
    public IvoryBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, OrientationType businessCardOrientation, ShippingOptionsType deliveryMethod) {
        super(businessCardType, businessCardSides, businessCardOrientation, BusinessCardColor.IVORY, deliveryMethod);
    }
}

final class GrayBusinessCard extends BusinessCard {
    public GrayBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, OrientationType businessCardOrientation, ShippingOptionsType deliveryMethod) {
        super(businessCardType, businessCardSides, businessCardOrientation, BusinessCardColor.GRAY, deliveryMethod);
    }
}

final class PortraitBusinessCard extends BusinessCard {
    public PortraitBusinessCard(BusinessCardType businessCardType, BusinessCardSide businessCardSides, BusinessCardColor businessCardColor, ShippingOptionsType deliveryMethod) {
        super(businessCardType, businessCardSides, OrientationType.PORTRAIT, businessCardColor, deliveryMethod);
    }
}

final class SingleSidedBusinessCard extends BusinessCard {
    public SingleSidedBusinessCard(BusinessCardType businessCardType, OrientationType businessCardOrientation, BusinessCardColor businessCardColor, ShippingOptionsType deliveryMethod) {
        super(businessCardType, BusinessCardSide.SINGLE, businessCardOrientation, businessCardColor, deliveryMethod);
    }
}

final class LinenBusinessCard extends BusinessCard {
    public LinenBusinessCard(BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor, ShippingOptionsType deliveryMethod) {
        super(BusinessCardType.LINEN, businessCardSides, businessCardOrientation, businessCardColor, deliveryMethod);
    }
}
