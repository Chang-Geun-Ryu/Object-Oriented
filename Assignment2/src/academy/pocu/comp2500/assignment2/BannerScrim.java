package academy.pocu.comp2500.assignment2;

public class BannerScrim extends Banner {
    public BannerScrim(BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(BannerType.SCRIM, size, color, orientation, deliveryMethod);
    }
    public OrientationType getOrientation() {
        return super.orientation;
    }
}
