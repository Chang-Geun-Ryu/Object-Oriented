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
        registry.registerLandscapeBannerCreator("BannerLandscape");
        registry.registerPortraitBannerCreator("BannerPortrait");
        registry.registerGlossBannerCreator("BannerGloss");
        registry.registerScrimBannerCreator("BannerScrim");
        registry.registerMeshBannerCreator("BannerMesh");
        registry.registerLandscapeBusinessCardCreator("BusinessCard");
        registry.registerPortraitBusinessCardCreator("BusinessCard");
        registry.registerIvoryBusinessCardCreator("BusinessCard");
        registry.registerGrayBusinessCardCreator("BusinessCard");
        registry.registerWhiteBusinessCardCreator("BusinessCard");
        registry.registerLaidBusinessCardCreator("BusinessCard");
        registry.registerLinenBusinessCardCreator("BusinessCard");
        registry.registerSmoothBusinessCardCreator("BusinessCard");
        registry.registerSingleSidedBusinessCardCreator("BusinessCard");
        registry.registerDoubleSidedBusinessCardCreator("BusinessCard");
//        registry.registerLandscapeBusinessCardCreator("BusinessCardLandscape");
//        registry.registerPortraitBusinessCardCreator("BusinessCardPortrait");
//        registry.registerIvoryBusinessCardCreator("BusinessCardIvory");
//        registry.registerGrayBusinessCardCreator("BusinessCardGray");
//        registry.registerWhiteBusinessCardCreator("BusinessCardWhite");
//        registry.registerLaidBusinessCardCreator("BusinessCardLaid");
//        registry.registerLinenBusinessCardCreator("BusinessCardLinen");
//        registry.registerSmoothBusinessCardCreator("BusinessCardSmooth");
//        registry.registerSingleSidedBusinessCardCreator("BusinessCardSingleSided");
//        registry.registerDoubleSidedBusinessCardCreator("BusinessCardDoubleSided");
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
