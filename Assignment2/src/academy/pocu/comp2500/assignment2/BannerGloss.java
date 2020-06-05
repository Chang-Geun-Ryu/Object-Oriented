package academy.pocu.comp2500.assignment2;

public class BannerGloss extends Banner {
    public BannerGloss(BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(BannerType.GLOSS, size, color, orientation, deliveryMethod);
        setPrice(size.getPrice() + 100);
    }
}
