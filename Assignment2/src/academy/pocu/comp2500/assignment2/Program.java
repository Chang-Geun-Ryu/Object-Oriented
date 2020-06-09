package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;

public class Program {

    public static void main(String[] args) {
	    // write your code here

//        Stamp bStamp =  new Stamp().blueStamp("textStemp", StempSizeType.FIVE_BY_TWO, ShippingOptionsType.PICKUP);
        BlueStamp bStamp = new BlueStamp("textStemp", StempSizeType.FIVE_BY_TWO, ShippingOptionsType.PICKUP);
//        bStamp.blueStamp("textStemp", StempSizeType.FIVE_BY_TWO, ShippingOptionsType.PICKUP);

        RedStamp rStamp = new RedStamp("red", StempSizeType.FOUR_BY_THREE, ShippingOptionsType.PICKUP);
        GreenStamp greenStamp = new GreenStamp("Green", StempSizeType.SEVEN_BY_FOUR, ShippingOptionsType.PICKUP);

        BusinessCardGray gCard = new BusinessCardGray(BusinessCardType.LAID, BusinessCardSide.SINGLE, OrientationType.LANDSCAPE, ShippingOptionsType.SHIP);
        BusinessCardIvory iCard = new BusinessCardIvory(BusinessCardType.LINEN, BusinessCardSide.SINGLE, OrientationType.LANDSCAPE, ShippingOptionsType.SHIP);
//        BusinessCardLaid lCard = new BusinessCardLaid(BusinessCardSide.SINGLE)

        BannerGloss gBanner = new BannerGloss(BannerSize.TWO_HALF, 0, OrientationType.LANDSCAPE, ShippingOptionsType.SHIP);
        BannerLandscape lBanner = new BannerLandscape(BannerType.MESH, BannerSize.ONE_HALF, 0, ShippingOptionsType.SHIP);
        BannerScrim sBanner = new BannerScrim(BannerSize.ONE_HALF, 0, OrientationType.PORTRAIT, ShippingOptionsType.SHIP);
        BannerMesh  mBanner = new BannerMesh(BannerSize.ONE_ONE, 0, OrientationType.LANDSCAPE, ShippingOptionsType.SHIP);
        BannerPortrait pBanner = new BannerPortrait(BannerType.SCRIM, BannerSize.THREE_ONE, 0, ShippingOptionsType.SHIP);




        Cart cart = new Cart();
//        cart.addProduct(bStamp);
//        cart.addProduct(rStamp);
//        cart.addProduct(greenStamp);
//        cart.addProduct(gCard);
        cart.addProduct(gBanner);
        cart.addProduct(lBanner);
        cart.addProduct(sBanner);
        cart.addProduct(mBanner);
        cart.addProduct(pBanner);

        cart.getAllProducts()
                .stream()
                .forEach(e->System.out.println(e.getPrice()));

        System.out.print("total: ");
        System.out.println(cart.getTotalPrice());

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();

//        Banner banner = new BannerGloss(BannerSize.ONE_HALF, 0, OrientationType.LANDSCAPE, ShippingOptionsType.PICKUP);
//        banner.getTexts();
    }
}
