package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BusinessCard extends Product {
    private BusinessCardSide side;
    private OrientationType orientation;

    private ArrayList<TextAperture> texts;
    private ArrayList<ImageAperture> imagePaths;

    protected BusinessCard(BusinessCardType type, BusinessCardSide sides, OrientationType orientation, BusinessCardColor color, ShippingOptionsType deliveryMethod) {
        super();//ArrayList<TextAperture> textAperture, ArrayList<ImageAperture> imageAperture,
        this.side = sides;
        this.orientation = orientation;

        setName(type.getName());
        setPrice(type.getPrice());
        setShippingOptions(deliveryMethod);

        this.texts = new ArrayList<>();
        this.imagePaths = new ArrayList<>();
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