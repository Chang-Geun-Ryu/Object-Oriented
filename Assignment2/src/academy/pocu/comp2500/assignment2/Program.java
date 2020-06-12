package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;

public class Program {

    public static void main(String[] args) {
	    // write your code here

        BlueStamp bStamp = new BlueStamp("textStemp", StempSizeType.FIVE_BY_TWO, ShippingOptionType.PICKUP);
        RedStamp rStamp = new RedStamp("red", StempSizeType.FOUR_BY_THREE, ShippingOptionType.PICKUP);
        GreenStamp greenStamp = new GreenStamp("Green", StempSizeType.SEVEN_BY_FOUR, ShippingOptionType.PICKUP);

        BusinessCardLinen linen1 = new BusinessCardLinen(BusinessCardSide.SINGLE, OrientationType.LANDSCAPE, BusinessCardColor.GRAY, ShippingOptionType.SHIP);
        BusinessCardLinen linen2 = new BusinessCardLinen(BusinessCardSide.DOUBLE, OrientationType.LANDSCAPE, BusinessCardColor.GRAY, ShippingOptionType.SHIP);
        BusinessCardLaid laid1 = new BusinessCardLaid(BusinessCardSide.SINGLE, OrientationType.LANDSCAPE, BusinessCardColor.GRAY, ShippingOptionType.SHIP);
        BusinessCardLaid laid2 = new BusinessCardLaid(BusinessCardSide.DOUBLE, OrientationType.LANDSCAPE, BusinessCardColor.GRAY, ShippingOptionType.SHIP);
        BusinessCardSmooth smooth1 = new BusinessCardSmooth(BusinessCardSide.SINGLE, OrientationType.LANDSCAPE, BusinessCardColor.GRAY, ShippingOptionType.SHIP);
        BusinessCardSmooth smooth2 = new BusinessCardSmooth(BusinessCardSide.DOUBLE, OrientationType.LANDSCAPE, BusinessCardColor.GRAY, ShippingOptionType.SHIP);

        BannerGloss gBanner = new BannerGloss(BannerSize.TWO_HALF, 0, OrientationType.LANDSCAPE, ShippingOptionType.SHIP);
        BannerGloss gBanner1 = new BannerGloss(BannerSize.ONE_HALF, 0, OrientationType.LANDSCAPE, ShippingOptionType.SHIP);
        BannerGloss gBanner2 = new BannerGloss(BannerSize.ONE_ONE, 0, OrientationType.LANDSCAPE, ShippingOptionType.SHIP);
        BannerGloss gBanner3 = new BannerGloss(BannerSize.THREE_ONE, 0, OrientationType.LANDSCAPE, ShippingOptionType.SHIP);
        BannerScrim sBanner = new BannerScrim(BannerSize.TWO_HALF, 0, OrientationType.PORTRAIT, ShippingOptionType.SHIP);
        BannerScrim sBanner1 = new BannerScrim(BannerSize.ONE_HALF, 0, OrientationType.PORTRAIT, ShippingOptionType.SHIP);
        BannerScrim sBanner2 = new BannerScrim(BannerSize.ONE_ONE, 0, OrientationType.PORTRAIT, ShippingOptionType.SHIP);
        BannerScrim sBanner3 = new BannerScrim(BannerSize.THREE_ONE, 0, OrientationType.PORTRAIT, ShippingOptionType.SHIP);
        BannerMesh  mBanner = new BannerMesh(BannerSize.TWO_HALF, 0, OrientationType.LANDSCAPE, ShippingOptionType.SHIP);
        BannerMesh  mBanner1 = new BannerMesh(BannerSize.ONE_HALF, 0, OrientationType.LANDSCAPE, ShippingOptionType.SHIP);
        BannerMesh  mBanner2 = new BannerMesh(BannerSize.ONE_ONE, 0, OrientationType.LANDSCAPE, ShippingOptionType.SHIP);
        BannerMesh  mBanner3 = new BannerMesh(BannerSize.THREE_ONE, 0, OrientationType.LANDSCAPE, ShippingOptionType.SHIP);

        DeskCalendar desk = new DeskCalendar(ShippingOptionType.SHIP);
        MagnetCalendar magnetCalendar = new MagnetCalendar(ShippingOptionType.SHIP);
        WallCalendar wall = new WallCalendar(ShippingOptionType.SHIP);

        Cart cart = new Cart();
        cart.addProduct(bStamp);
        cart.addProduct(rStamp);
        cart.addProduct(greenStamp);
        cart.addProduct(linen1);
        cart.addProduct(linen2);
        cart.addProduct(laid1);
        cart.addProduct(laid2);
        cart.addProduct(smooth1);
        cart.addProduct(smooth2);
        cart.addProduct(gBanner);
        cart.addProduct(gBanner1);
        cart.addProduct(gBanner2);
        cart.addProduct(gBanner3);
        cart.addProduct(sBanner);
        cart.addProduct(sBanner1);
        cart.addProduct(sBanner2);
        cart.addProduct(sBanner3);
        cart.addProduct(mBanner);
        cart.addProduct(mBanner1);
        cart.addProduct(mBanner2);
        cart.addProduct(mBanner3);

        cart.addProduct(desk);
        cart.addProduct(magnetCalendar);
        cart.addProduct(wall);

        BannerLandscape landscape = new BannerLandscape(BannerType.GLOSS, BannerSize.ONE_ONE, 0x000000, ShippingOptionType.SHIP);

        System.out.print(landscape.getPrice());


//        linen1.addAperture(new ImageAperture("d", ,1, 100, 200));
//        linen1.addAperture(new TextAperture("asfd", -100,30,150,200));
        System.out.print("total: ");
        System.out.println(cart.getTotalPrice());

        gBanner2.addAperture(new TextAperture("1", -100, -100, 200, 200));
        gBanner2.addAperture(new TextAperture("2", 900, -100, 200, 200));
        gBanner2.addAperture(new TextAperture("3", -100, 900, 200, 200));
        gBanner2.addAperture(new TextAperture("4", 900, 900, 200, 200));

        gBanner2.addAperture(new TextAperture("5", -100, -100, 1, 1));
        gBanner2.addAperture(new TextAperture("511", -1000, -1000, 1, 1));

        gBanner2.addAperture(new TextAperture("10000", -1000, -1000, 10000, 10000));
//        gBanner2.addAperture(new TextAperture("6,", ));

        System.out.print("total: ");
        System.out.println(cart.getTotalPrice());

        System.out.println(linen1.getWidth());
        System.out.println(linen1.getHeight());

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();

//        Banner banner = new BannerGloss(BannerSize.ONE_HALF, 0, OrientationType.LANDSCAPE, ShippingOptionsType.PICKUP);
//        banner.getTexts();
    }
}
