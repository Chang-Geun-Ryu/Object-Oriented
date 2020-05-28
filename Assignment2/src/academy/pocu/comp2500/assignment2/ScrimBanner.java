package academy.pocu.comp2500.assignment2;

public class ScrimBanner extends Banner {
    public ScrimBanner(BannerSize bannerSize, String bannerColor, OrientationType bannerOrientation) {
        super(BannerType.SCRIM, bannerSize, bannerColor, bannerOrientation);

        setPrice(bannerSize.getPrice() + 100);
    }
}
