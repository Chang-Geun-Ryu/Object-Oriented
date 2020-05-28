package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;

public class App {
    public App(Registry registry) {
        // register your classes or methods here
        /// 2개 가능


        registry.registerRedStampCreator("RedStemp");
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
        registry.registerLandscapeBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerLandscapeBusinnessCardImageApertureAdder("BusinessCard", "addImagePath");
        registry.registerPortraitBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerPortraitBusinnessCardImageApertureAdder("BusinessCard", "addImagePath");
        registry.registerIvoryBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerIvoryBusinnessCardImageApertureAdder("BusinessCard", "addImagePath");
        registry.registerGrayBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerGrayBusinnessCardImageApertureAdder("BusinessCard", "addImagePath");
        registry.registerWhiteBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerWhiteBusinnessCardImageApertureAdder("BusinessCard", "addImagePath");
        registry.registerLaidBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerLaidBusinnessCardImageApertureAdder("BusinessCard", "addImagePath");
        registry.registerLinenBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerLinenBusinnessCardImageApertureAdder("BusinessCard", "addImagePath");
        registry.registerSmoothBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerSmoothBusinnessCardImageApertureAdder("BusinessCard", "addImagePath");
        registry.registerSingleSidedBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerSingleSidedBusinnessCardImageApertureAdder("BusinessCard", "addImagePath");
        registry.registerDoubleSidedBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerDoubleSidedBusinnessCardImageApertureAdder("BusinessCard", "addImagePath");

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
