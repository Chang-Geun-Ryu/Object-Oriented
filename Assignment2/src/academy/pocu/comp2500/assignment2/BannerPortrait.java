package academy.pocu.comp2500.assignment2;

public class BannerPortrait extends Banner {
//    private BannerType type;
    public BannerPortrait(BannerType bannerType, BannerSize size, int bannerColor, ShippingOptionType deliveryMethod) {
        super(bannerType, size, bannerColor, OrientationType.PORTRAIT, deliveryMethod);
    }
}
