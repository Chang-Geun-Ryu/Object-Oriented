package academy.pocu.comp2500.assignment2;

public class OrientationBanner extends Banner {
    protected OrientationBanner(BannerType type, BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(type, size, color, orientation, deliveryMethod);
    }

    public BannerType getType() {
        return this.type;
    }
}
