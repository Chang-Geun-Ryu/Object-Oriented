package academy.pocu.comp2500.assignment2;

public class BannerMesh extends TypeBanner {
    public BannerMesh(BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(BannerType.MESH, size, color, orientation, deliveryMethod);
    }
//    public OrientationType getOrientation() {
//        return super.orientation;
//    }
}
