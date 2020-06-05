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
        registry.registerLandscapeBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerLandscapeBusinnessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerPortraitBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerPortraitBusinnessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerIvoryBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerIvoryBusinnessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerGrayBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerGrayBusinnessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerWhiteBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerWhiteBusinnessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerLaidBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerLaidBusinnessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerLinenBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerLinenBusinnessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerSmoothBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerSmoothBusinnessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerSingleSidedBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerSingleSidedBusinnessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerDoubleSidedBusinnessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerDoubleSidedBusinnessCardImageApertureAdder("BusinessCard", "addImage");
    }
}
