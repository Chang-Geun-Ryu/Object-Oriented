package academy.pocu.comp2500.assignment2;

public class Banner extends Option {
    protected BannerType bannerType;

    protected Banner(BannerType bannerType, BannerSize bannerSize, int bannerColor, OrientationType orientation, ShippingOptionType deliveryMethod) {
        super(orientation);
        this.bannerType = bannerType;
        super.side = BusinessCardSide.SINGLE;
        setName(bannerType.getName() + bannerSize.getSize());
        setPrice(bannerSize.getPrice() + bannerType.getAddPrice());
        setShippingOption(deliveryMethod);
        setWidth(bannerSize.getWidth());
        setHeight(bannerSize.getHeight());
        setColor(bannerColor);
    }

    public BannerType getType() {
        return this.bannerType;
    }
}