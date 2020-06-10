package academy.pocu.comp2500.assignment2;

public class BannerPortrait extends Banner {
    public BannerPortrait(BannerType type, BannerSize size, int color, ShippingOptionsType deliveryMethod) {
        super(type, size, color, OrientationType.PORTRAIT, deliveryMethod);
    }
}
