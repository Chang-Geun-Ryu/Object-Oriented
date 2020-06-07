package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Banner extends Product {
    private OrientationType orientation;
    private BannerSize size;
    private int color;

    private ArrayList<TextAperture> texts;
    private ArrayList<ImageAperture> imagePaths;

    protected Banner(BannerType type, BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super();
        this.orientation = orientation;
        this.size = size;
        this.color = color;
        setName(type.getName() + size.getSize());
        setPrice(size.getPrice());
        this.texts = new ArrayList<>();
        this.imagePaths = new ArrayList<>();
    }

    public OrientationType getOrientation() {
        return this.orientation;
    }

    public BannerSize getSize() {
        return this.size;
    }

    public int getColor() {
        return this.color;
    }

    public ArrayList<ImageAperture> getImagePaths() {
        return this.imagePaths;
    }

    public ArrayList<TextAperture> getTexts() {
        return this.texts;
    }

    public void addText(TextAperture textAperture) {
        this.texts.add(textAperture);
        setPrice(getPrice() + 5);
    }

    public void addImage(ImageAperture imageAperture) {
        this.imagePaths.add(imageAperture);
        setPrice(getPrice() + 5);
    }
}