package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BannerLandscape extends Banner {
    public BannerLandscape(BannerType type, BannerSize size, int color, ShippingOptionsType deliveryMethod, ArrayList<TextAperture> textAperture, ArrayList<ImageAperture> imageAperture) {
        super(type, size, color, OrientationType.LANDSCAPE, deliveryMethod, textAperture, imageAperture);
    }
}
