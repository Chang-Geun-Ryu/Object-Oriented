package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCard extends Product {
    private BusinessCardSide side;
    private OrientationType orientation;

    private ArrayList<TextAperture> texts;
    private ArrayList<ImageAperture> imagePaths;

    public BusinessCard(BusinessCardType type, BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
//        super("90 mm x 50 mm", color.getColor(), type.getPrice() + sides.getAddPrice(), deliveryMethod);
//        super(color.getColor(), type.getPrice() + sides.getAddPrice(), deliveryMethod);
        super();
        this.side = sides;
        this.orientation = orientation;

//        setWidth(type.getWidth());
//        setHeight(type.getHeight());
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

//final class LaidBusinessCard extends BusinessCard {
//    public LaidBusinessCard(BusinessCardSide businessCardSides, OrientationType businessCardOrientation, BusinessCardColor businessCardColor, ShippingOptionsType deliveryMethod) {
//        super(BusinessCardType.LAID, businessCardSides, businessCardOrientation, businessCardColor, deliveryMethod);
//    }
//}
//
//final class SingleSidedBusinessCard extends BusinessCard {
//    public SingleSidedBusinessCard(BusinessCardType businessCardType, OrientationType businessCardOrientation, BusinessCardColor businessCardColor, ShippingOptionsType deliveryMethod) {
//        super(businessCardType, BusinessCardSide.SINGLE, businessCardOrientation, businessCardColor, deliveryMethod);
//    }
//}
