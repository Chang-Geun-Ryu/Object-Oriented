package academy.pocu.comp2500.assignment2;

public class BannerPortrait extends Banner {
    private BannerType type;

    public BannerPortrait(BannerType type, BannerSize size, int color, ShippingOptionsType deliveryMethod) {
        super(type, size, color, OrientationType.PORTRAIT, deliveryMethod);
        this.type = type;
    }

    public BannerType getType() {
        return this.type;
    }
}
