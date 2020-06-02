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
        registry.registerLandscapeBannerTextApertureAdder("Banner", "addText");
        registry.registerLandscapeBannerImageApertureAdder("Banner", "addImage");
        registry.registerPortraitBannerTextApertureAdder("Banner", "addText");
        registry.registerPortraitBannerImageApertureAdder("Banner", "addImage");
        registry.registerGlossBannerTextApertureAdder("Banner", "addText");
        registry.registerGlossBannerImageApertureAdder("Banner", "addImage");
        registry.registerScrimBannerTextApertureAdder("Banner", "addText");
        registry.registerScrimBannerImageApertureAdder("Banner", "addImage");
        registry.registerMeshBannerTextApertureAdder("Banner", "addText");
        registry.registerMeshBannerImageApertureAdder("Banner", "addImage");
        registry.registerLandscapeBusinnessCardTextApertureAdder("Banner", "addText");
        registry.registerLandscapeBusinnessCardImageApertureAdder("Banner", "addImage");
        registry.registerPortraitBusinnessCardTextApertureAdder("Banner", "addText");
        registry.registerPortraitBusinnessCardImageApertureAdder("Banner", "addImage");
        registry.registerIvoryBusinnessCardTextApertureAdder("Banner", "addText");
        registry.registerIvoryBusinnessCardImageApertureAdder("Banner", "addImage");
        registry.registerGrayBusinnessCardTextApertureAdder("Banner", "addText");
        registry.registerGrayBusinnessCardImageApertureAdder("Banner", "addImage");
        registry.registerWhiteBusinnessCardTextApertureAdder("Banner", "addText");
        registry.registerWhiteBusinnessCardImageApertureAdder("Banner", "addImage");
        registry.registerLaidBusinnessCardTextApertureAdder("Banner", "addText");
        registry.registerLaidBusinnessCardImageApertureAdder("Banner", "addImage");
        registry.registerLinenBusinnessCardTextApertureAdder("Banner", "addText");
        registry.registerLinenBusinnessCardImageApertureAdder("Banner", "addImage");
        registry.registerSmoothBusinnessCardTextApertureAdder("Banner", "addText");
        registry.registerSmoothBusinnessCardImageApertureAdder("Banner", "addImage");
        registry.registerSingleSidedBusinnessCardTextApertureAdder("Banner", "addText");
        registry.registerSingleSidedBusinnessCardImageApertureAdder("Banner", "addImage");
        registry.registerDoubleSidedBusinnessCardTextApertureAdder("Banner", "addText");
        registry.registerDoubleSidedBusinnessCardImageApertureAdder("Banner", "addImage");

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
