package academy.pocu.comp2500.assignment2;

public class Banner extends Option {
    protected BannerType bannerType;

    protected Banner(BannerType type, BannerSize size, int color, OrientationType orientation, ShippingOptionType deliveryMethod) {
        super(orientation);
        this.bannerType = type;
        setName(type.getName() + size.getSize());
        setPrice(size.getPrice() + type.getAddPrice());
        setShippingOption(deliveryMethod);
        setWidth(size.getWidth());
        setHeight(size.getHeight());
        setColor(color);
    }

    public BannerType getType() {
        return this.bannerType;
    }
}