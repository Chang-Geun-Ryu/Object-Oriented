package academy.pocu.comp2500.assignment2;

public class BannerScrim extends Banner {
    public BannerScrim(BannerSize bannerSize, int bannerColor, OrientationType orientation, ShippingOptionType deliveryMethod) {
        super(BannerType.SCRIM, bannerSize, bannerColor, orientation, deliveryMethod);
    }
}
