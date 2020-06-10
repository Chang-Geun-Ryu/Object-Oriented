package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BannerGloss extends TypeBanner {
    public BannerGloss(BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(BannerType.GLOSS, size, color, orientation, deliveryMethod);
    }

//    public OrientationType getOrientation() {
//        return super.orientation;
//    }
}
