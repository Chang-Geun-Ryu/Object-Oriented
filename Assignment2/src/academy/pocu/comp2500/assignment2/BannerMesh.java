package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class BannerMesh extends Banner {
    public BannerMesh(BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod, ArrayList<TextAperture> textAperture, ArrayList<ImageAperture> imageAperture) {
        super(BannerType.MESH, size, color, orientation, deliveryMethod, textAperture, imageAperture);
    }
}
