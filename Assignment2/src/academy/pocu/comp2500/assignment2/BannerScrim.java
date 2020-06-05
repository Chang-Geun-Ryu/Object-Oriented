package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BannerScrim extends Banner {
    public BannerScrim(BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod, ArrayList<TextAperture> textAperture, ArrayList<ImageAperture> imageAperture) {
        super(BannerType.GLOSS, size, color, orientation, deliveryMethod, textAperture, imageAperture);
    }
}
