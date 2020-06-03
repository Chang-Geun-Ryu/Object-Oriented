package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Banner extends Product {
    private OrientationType orientation;

    private ArrayList<TextAperture> texts;
    private ArrayList<ImageAperture> imagePaths;

    public Banner(BannerType type, BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod) {
//        super(size.getSize(), color, size.getPrice(), deliveryMethod);
        super(color, size.getPrice(), deliveryMethod);
        this.orientation = orientation;
        setWidth(size.getWidth());
        setHeight(size.getHeight());
        setName(type.getName());
        this.texts = new ArrayList<>();
        this.imagePaths = new ArrayList<>();
    }

    public void setOrientation(OrientationType orientation) {
        this.orientation = orientation;
    }

    public OrientationType getOrientation() {
        return this.orientation;
    }

    public ArrayList<ImageAperture> getImagePaths() {
        return this.imagePaths;
    }

    public ArrayList<TextAperture> getTexts() {
        return this.texts;
    }

    public void addText(TextAperture textAperture) {
        this.texts.add(textAperture);
    }

    public void addImage(ImageAperture imageAperture) {
        this.imagePaths.add(imageAperture);
    }
}

final class MeshBanner extends Banner {
    public MeshBanner(BannerSize bannerSize, int bannerColor, OrientationType bannerOrientation, ShippingOptionsType deliveryMethod) {
        super(BannerType.MESH, bannerSize, bannerColor, bannerOrientation, deliveryMethod);

        setPrice(bannerSize.getPrice() + 100);
    }
}

final class GlossBanner extends Banner {
    public GlossBanner(BannerSize bannerSize, int bannerColor, OrientationType bannerOrientation, ShippingOptionsType deliveryMethod) {
        super(BannerType.GLOSS, bannerSize, bannerColor, bannerOrientation, deliveryMethod);
    }
}

final class ScrimBanner extends Banner {
    public ScrimBanner(BannerSize bannerSize, int bannerColor, OrientationType bannerOrientation, ShippingOptionsType deliveryMethod) {
        super(BannerType.SCRIM, bannerSize, bannerColor, bannerOrientation, deliveryMethod);
        setPrice(bannerSize.getPrice() + 100);
    }
}

final class LandscapeBanner extends Banner {
    public LandscapeBanner(BannerType bannerType, BannerSize bannerSize, int bannerColor, ShippingOptionsType deliveryMethod) {
        super(bannerType, bannerSize, bannerColor, OrientationType.LANDSCAPE, deliveryMethod);
    }
}

final class PortraitBanner extends Banner {
    public PortraitBanner(BannerType bannerType, BannerSize bannerSize, int bannerColor, ShippingOptionsType deliveryMethod) {
        super(bannerType, bannerSize, bannerColor, OrientationType.PORTRAIT, deliveryMethod);
    }
}