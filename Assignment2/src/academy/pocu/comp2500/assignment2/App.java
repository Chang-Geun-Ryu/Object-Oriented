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
        registry.registerLandscapeBusinessCardCreator("BusinessCardLandscape");
        registry.registerPortraitBusinessCardCreator("BusinessCardPortrait");
        registry.registerIvoryBusinessCardCreator("BusinessCardIvory");
        registry.registerGrayBusinessCardCreator("BusinessCardGray");
        registry.registerWhiteBusinessCardCreator("BusinessCardWhite");
        registry.registerLaidBusinessCardCreator("BusinessCardLaid");
        registry.registerLinenBusinessCardCreator("BusinessCardLinen");
        registry.registerSmoothBusinessCardCreator("BusinessCardSmooth");
        registry.registerSingleSidedBusinessCardCreator("BusinessCardSingleSided");
        registry.registerDoubleSidedBusinessCardCreator("BusinessCardDoubleSided");
        registry.registerCartCreator("Cart");
        registry.registerProductAdder("Cart", "addProduct");
        registry.registerProductRemover("Cart", "removeProduct");
        registry.registerTotalPriceGetter("Cart", "getTotalPrice");
        registry.registerLandscapeBannerTextApertureAdder("Option", "addText");
        registry.registerLandscapeBannerImageApertureAdder("Option", "addImage");
        registry.registerPortraitBannerTextApertureAdder("Option", "addText");
        registry.registerPortraitBannerImageApertureAdder("Option", "addImage");
        registry.registerGlossBannerTextApertureAdder("Option", "addText");
        registry.registerGlossBannerImageApertureAdder("Option", "addImage");
        registry.registerScrimBannerTextApertureAdder("Option", "addText");
        registry.registerScrimBannerImageApertureAdder("Option", "addImage");
        registry.registerMeshBannerTextApertureAdder("Option", "addText");
        registry.registerMeshBannerImageApertureAdder("Option", "addImage");
        registry.registerLandscapeBusinnessCardTextApertureAdder("Option", "addText");
        registry.registerLandscapeBusinnessCardImageApertureAdder("Option", "addImage");
        registry.registerPortraitBusinnessCardTextApertureAdder("Option", "addText");
        registry.registerPortraitBusinnessCardImageApertureAdder("Option", "addImage");
        registry.registerIvoryBusinnessCardTextApertureAdder("Option", "addText");
        registry.registerIvoryBusinnessCardImageApertureAdder("Option", "addImage");
        registry.registerGrayBusinnessCardTextApertureAdder("Option", "addText");
        registry.registerGrayBusinnessCardImageApertureAdder("Option", "addImage");
        registry.registerWhiteBusinnessCardTextApertureAdder("Option", "addText");
        registry.registerWhiteBusinnessCardImageApertureAdder("Option", "addImage");
        registry.registerLaidBusinnessCardTextApertureAdder("Option", "addText");
        registry.registerLaidBusinnessCardImageApertureAdder("Option", "addImage");
        registry.registerLinenBusinnessCardTextApertureAdder("Option", "addText");
        registry.registerLinenBusinnessCardImageApertureAdder("Option", "addImage");
        registry.registerSmoothBusinnessCardTextApertureAdder("Option", "addText");
        registry.registerSmoothBusinnessCardImageApertureAdder("Option", "addImage");
        registry.registerSingleSidedBusinnessCardTextApertureAdder("Option", "addText");
        registry.registerSingleSidedBusinnessCardImageApertureAdder("Option", "addImage");
        registry.registerDoubleSidedBusinnessCardTextApertureAdder("Option", "addText");
        registry.registerDoubleSidedBusinnessCardImageApertureAdder("Option", "addImage");
    }
}