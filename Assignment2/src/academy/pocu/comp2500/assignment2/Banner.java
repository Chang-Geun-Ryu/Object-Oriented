package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Banner extends Option {
//    private OrientationType orientation;
    private BannerSize size;
    private int color;
    private BannerType type;

//    private ArrayList<TextAperture> texts;
//    private ArrayList<ImageAperture> imagePaths;

    protected Banner(BannerType type, BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(orientation, BusinessCardSide.SINGLE);
//        this.orientation = orientation;
        this.size = size;
        this.color = color;
        this.type = type;
        setName(type.getName() + size.getSize());
        setPrice(size.getPrice() + type.getAddPrice());
        setShippingOptions(deliveryMethod);
//        this.texts = new ArrayList<>();
//        this.imagePaths = new ArrayList<>();
    }

    public BannerType getType() {
        return this.type;
    }

//    public OrientationType getOrientation() {
//        return this.orientation;
//    }

    public BannerSize getSize() {
        return this.size;
    }

    public int getColor() {
        return this.color;
    }

    public int getWidth() {
        return this.size.getWidth();
    }

    public int getHeight() {
        return this.size.getHeight();
    }

//    public ArrayList<ImageAperture> getImagePaths() {
//        return this.imagePaths;
//    }
//
//    public ArrayList<TextAperture> getTexts() {
//        return this.texts;
//    }

//    public void addText(TextAperture textAperture) {
//        this.texts.add(textAperture);
////        if (textAperture.getX() >= 0 &&
////        textAperture.getX() < size.getWidth() &&
////        textAperture.getY() >= 0 &&
////        textAperture.getY() < size.getHeight()) {
//            setPrice(getPrice() + 5);
////        }
//    }
//
//    public void addImage(ImageAperture imageAperture) {
//        this.imagePaths.add(imageAperture);
////        if (imageAperture.getX() >= 0 &&
////                imageAperture.getX() < size.getWidth() &&
////                imageAperture.getY() >= 0 &&
////                imageAperture.getY() < size.getHeight()) {
//            setPrice(getPrice() + 5);
////        }
//    }
}