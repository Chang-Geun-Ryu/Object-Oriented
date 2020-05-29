package academy.pocu.comp2500.assignment2;

public class Banner extends Product {
    private OrientationType orientation;

    public Banner(BannerType bannerType, BannerSize bannerSize, String bannerColor, OrientationType bannerOrientation) {
        super(bannerSize.getSize(), bannerColor, bannerSize.getPrice());
        this.orientation = bannerOrientation;
//        this.texts = new ArrayList<>();
//        this.imagePaths = new ArrayList<>();

        setWidth(bannerSize.getWidth());
        setHeight(bannerSize.getHeight());
    }

    public void setOrientation(OrientationType orientation) {
        this.orientation = orientation;
    }

    public OrientationType getOrientation() {
        return this.orientation;
    }


}
