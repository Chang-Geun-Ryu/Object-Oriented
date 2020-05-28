package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Banner extends Product {
    private OrientationType orientation;
    private ArrayList<String> texts;
    private ArrayList<String> imagePaths;

    public Banner(BannerType bannerType, BannerSize bannerSize, String bannerColor, OrientationType bannerOrientation) {
        super(bannerType.getName(), bannerSize.getSize(), bannerColor, bannerSize.getPrice());
        this.orientation = bannerOrientation;
        this.texts = new ArrayList<>();
        this.imagePaths = new ArrayList<>();

        setWidth(bannerSize.getWidth());
        setHeight(bannerSize.getHeight());
    }

    public void setOrientation(OrientationType orientation) {
        this.orientation = orientation;
    }

    public OrientationType getOrientation() {
        return this.orientation;
    }

    public int getPrice() {
        return super.getPrice() + (this.texts.size() + this.imagePaths.size()) * 5;
    }

    public ArrayList<String> getTexts() {
        return this.texts;
    }

    public void addText(String text) {
        this.texts.add(text);
    }

    public void addImage(String imagePath) {
        this.imagePaths.add(imagePath);
    }

}
