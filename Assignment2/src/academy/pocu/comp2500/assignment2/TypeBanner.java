package academy.pocu.comp2500.assignment2;

public class TypeBanner extends Banner {
    protected TypeBanner(BannerType type, BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(type, size, color, orientation, deliveryMethod);
    }

    public OrientationType getOrientation() {
        return super.orientation;
    }
}
