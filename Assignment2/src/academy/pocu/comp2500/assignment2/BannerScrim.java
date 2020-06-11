package academy.pocu.comp2500.assignment2;

public class BannerScrim extends Banner {
    public BannerScrim(BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(Type.LAID, size, color, orientation, deliveryMethod);
    }
//    public OrientationType getOrientation() {
//        return super.orientation;
//    }
}
//public enum BannerType {
//    GLOSS("Gloss", 0),
//    SCRIM("Scrim", 100),
//    MESH("Mesh", 100);
//
//    private String name;
//    private int addPrice;
//
//    public String getName() {
//        return this.name;
//    }
//    public int getAddPrice() {
//        return this.addPrice;
//    }
//
//    private BannerType(String name, int addPrice) {
//        this.name = name;
//        this.addPrice = addPrice;
//    }
//}
