package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;

public class App {
    public App(Registry registry) {
        // register your classes or methods here
        /// 2개 가능


        registry.registerRedStampCreator("RedStamp");
        registry.registerBlueStampCreator("BlueStamp");
        registry.registerGreenStampCreator("GreenStamp");
        registry.registerWallCalendarCreator("WallCalendar");
        registry.registerMagnetCalendarCreator("MagnetCalendar");
        registry.registerDeskCalendarCreator("DeskCalendar");
        registry.registerLandscapeBannerCreator("LandscapeBanner");
        registry.registerPortraitBannerCreator("PortraitBanner");
        registry.registerGlossBannerCreator("GlossBanner");
        registry.registerScrimBannerCreator("ScrimBanner");
        registry.registerMeshBannerCreator("MeshBanner");
        registry.registerLandscapeBusinessCardCreator("LandscapeBusinessCard");
        registry.registerPortraitBusinessCardCreator("PortraitBusinessCard");
        registry.registerIvoryBusinessCardCreator("IvoryBusinessCard");
        registry.registerGrayBusinessCardCreator("GrayBusinessCard");
        registry.registerWhiteBusinessCardCreator("WhiteBusinessCard");
        registry.registerLaidBusinessCardCreator("LaidBusinessCard");
        registry.registerLinenBusinessCardCreator("LinenBusinessCard");
        registry.registerSmoothBusinessCardCreator("SmoothBusinessCard");
        registry.registerSingleSidedBusinessCardCreator("SingleSidedBusinessCard");
        registry.registerDoubleSidedBusinessCardCreator("DoubleSidedBusinessCard");
        registry.registerCartCreator("Cart");
        registry.registerProductAdder("Cart", "addProduct");
        registry.registerProductRemover("Cart", "removeProduct");
        registry.registerTotalPriceGetter("Cart", "getTotalPrice");
        registry.registerLandscapeBannerTextApertureAdder("Product", "addText");
        registry.registerLandscapeBannerImageApertureAdder("Product", "addImage");
        registry.registerPortraitBannerTextApertureAdder("Product", "addText");
        registry.registerPortraitBannerImageApertureAdder("Product", "addImage");
        registry.registerGlossBannerTextApertureAdder("Product", "addText");
        registry.registerGlossBannerImageApertureAdder("Product", "addImage");
        registry.registerScrimBannerTextApertureAdder("Product", "addText");
        registry.registerScrimBannerImageApertureAdder("Product", "addImage");
        registry.registerMeshBannerTextApertureAdder("Product", "addText");
        registry.registerMeshBannerImageApertureAdder("Product", "addImage");
        registry.registerLandscapeBusinnessCardTextApertureAdder("Product", "addText");
        registry.registerLandscapeBusinnessCardImageApertureAdder("Product", "addImage");
        registry.registerPortraitBusinnessCardTextApertureAdder("Product", "addText");
        registry.registerPortraitBusinnessCardImageApertureAdder("Product", "addImage");
        registry.registerIvoryBusinnessCardTextApertureAdder("Product", "addText");
        registry.registerIvoryBusinnessCardImageApertureAdder("Product", "addImage");
        registry.registerGrayBusinnessCardTextApertureAdder("Product", "addText");
        registry.registerGrayBusinnessCardImageApertureAdder("Product", "addImage");
        registry.registerWhiteBusinnessCardTextApertureAdder("Product", "addText");
        registry.registerWhiteBusinnessCardImageApertureAdder("Product", "addImage");
        registry.registerLaidBusinnessCardTextApertureAdder("Product", "addText");
        registry.registerLaidBusinnessCardImageApertureAdder("Product", "addImage");
        registry.registerLinenBusinnessCardTextApertureAdder("Product", "addText");
        registry.registerLinenBusinnessCardImageApertureAdder("Product", "addImage");
        registry.registerSmoothBusinnessCardTextApertureAdder("Product", "addText");
        registry.registerSmoothBusinnessCardImageApertureAdder("Product", "addImage");
        registry.registerSingleSidedBusinnessCardTextApertureAdder("Product", "addText");
        registry.registerSingleSidedBusinnessCardImageApertureAdder("Product", "addImage");
        registry.registerDoubleSidedBusinnessCardTextApertureAdder("Product", "addText");
        registry.registerDoubleSidedBusinnessCardImageApertureAdder("Product", "addImage");

//        registry.registerLandscapeBannerTextApertureAdder("LandscapeBanner", "addText");
//        registry.registerLandscapeBannerImageApertureAdder("LandscapeBanner", "addImage");
//        registry.registerPortraitBannerTextApertureAdder("PortraitBanner", "addText");
//        registry.registerPortraitBannerImageApertureAdder("PortraitBanner", "addImage");
//        registry.registerGlossBannerTextApertureAdder("GlossBanner", "addText");
//        registry.registerGlossBannerImageApertureAdder("GlossBanner", "addImage");
//        registry.registerScrimBannerTextApertureAdder("ScrimBanner", "addText");
//        registry.registerScrimBannerImageApertureAdder("ScrimBanner", "addImage");
//        registry.registerMeshBannerTextApertureAdder("MeshBanner", "addText");
//        registry.registerMeshBannerImageApertureAdder("MeshBanner", "addImage");
//        registry.registerLandscapeBusinnessCardTextApertureAdder("LandscapeBusinessCard", "addText");
//        registry.registerLandscapeBusinnessCardImageApertureAdder("LandscapeBusinessCard", "addImagePath");
//        registry.registerPortraitBusinnessCardTextApertureAdder("PortraitBusinessCard", "addText");
//        registry.registerPortraitBusinnessCardImageApertureAdder("PortraitBusinessCard", "addImagePath");
//        registry.registerIvoryBusinnessCardTextApertureAdder("IvoryBusinessCard", "addText");
//        registry.registerIvoryBusinnessCardImageApertureAdder("IvoryBusinessCard", "addImagePath");
//        registry.registerGrayBusinnessCardTextApertureAdder("GrayBusinessCard", "addText");
//        registry.registerGrayBusinnessCardImageApertureAdder("GrayBusinessCard", "addImagePath");
//        registry.registerWhiteBusinnessCardTextApertureAdder("WhiteBusinessCard", "addText");
//        registry.registerWhiteBusinnessCardImageApertureAdder("WhiteBusinessCard", "addImagePath");
//        registry.registerLaidBusinnessCardTextApertureAdder("LaidBusinessCard", "addText");
//        registry.registerLaidBusinnessCardImageApertureAdder("LaidBusinessCard", "addImagePath");
//        registry.registerLinenBusinnessCardTextApertureAdder("LinenBusinessCard", "addText");
//        registry.registerLinenBusinnessCardImageApertureAdder("LinenBusinessCard", "addImagePath");
//        registry.registerSmoothBusinnessCardTextApertureAdder("SmoothBusinnessCard", "addText");
//        registry.registerSmoothBusinnessCardImageApertureAdder("SmoothBusinnessCard", "addImagePath");
//        registry.registerSingleSidedBusinnessCardTextApertureAdder("SingleSidedBusinessCard", "addText");
//        registry.registerSingleSidedBusinnessCardImageApertureAdder("SingleSidedBusinessCard", "addImagePath");
//        registry.registerDoubleSidedBusinnessCardTextApertureAdder("DoubleSidedBusinessCard", "addText");
//        registry.registerDoubleSidedBusinnessCardImageApertureAdder("DoubleSidedBusinessCard", "addImagePath");
    }
}
