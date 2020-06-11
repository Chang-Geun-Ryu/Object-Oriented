package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Banner extends Option {
    private int color;
    protected BannerType type;

    protected Banner(BannerType type, BannerSize size, int color, OrientationType orientation, ShippingOptionsType deliveryMethod) {
        super(orientation);
        this.color = color;
        this.type = type;
        setName(type.getName() + size.getSize());
        setPrice(size.getPrice() + type.getAddPrice());
        setShippingOptions(deliveryMethod);
        setWidth(size.getWidth());
        setHeight(size.getHeight());
//        setColor(color);
    }

    public int getColor() {
        return this.color;
    }

    public OrientationType getOrientation() {
        return super.orientation;
    }

    public BannerType getType() {
        return this.type;
    }
}