package academy.pocu.comp2500.assignment2;

public class BannerLandscape extends Banner {
//    private BannerType type;
    public BannerLandscape(BannerType type, BannerSize size, int color, ShippingOptionsType deliveryMethod) {
        super(type, size, color, OrientationType.LANDSCAPE, deliveryMethod);
    }
//    public BannerType getType() {
//        return this.type;
//    }
}
