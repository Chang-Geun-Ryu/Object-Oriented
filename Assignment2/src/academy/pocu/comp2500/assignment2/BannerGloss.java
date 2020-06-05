package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BannerGloss extends Banner {
    public BannerGloss(BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(BannerType.GLOSS, size, color, orientation, deliveryMethod);
        setPrice(super.getPrice() + 100);
    }
}
