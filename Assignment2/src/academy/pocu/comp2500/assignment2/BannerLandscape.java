package academy.pocu.comp2500.assignment2;

public class BannerLandscape extends Banner {
//    private BannerType type;
    public BannerLandscape(BannerType bannerType, BannerSize size, int bannerColor, ShippingOptionType deliveryMethod) {
        super(bannerType, size, bannerColor, OrientationType.LANDSCAPE, deliveryMethod);
    }
}
