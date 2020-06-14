package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;

public class App {
    public App(Registry registry) {
        // register your classes or methods here
        /// 2개 가능
//        registry.registerRedStampCreator("RedStamp");
//        registry.registerBlueStampCreator("BlueStamp");
//        registry.registerGreenStampCreator("GreenStamp");
        registry.registerRedStampCreator("Stamp");
        registry.registerBlueStampCreator("Stamp");
        registry.registerGreenStampCreator("Stamp");
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

        registry.registerLandscapeBannerTextApertureAdder("Option", "addAperture");
        registry.registerLandscapeBannerImageApertureAdder("Option", "addAperture");
        registry.registerPortraitBannerTextApertureAdder("Option", "addAperture");
        registry.registerPortraitBannerImageApertureAdder("Option", "addAperture");
        registry.registerGlossBannerTextApertureAdder("Option", "addAperture");
        registry.registerGlossBannerImageApertureAdder("Option", "addAperture");
        registry.registerScrimBannerTextApertureAdder("Option", "addAperture");
        registry.registerScrimBannerImageApertureAdder("Option", "addAperture");
        registry.registerMeshBannerTextApertureAdder("Option", "addAperture");
        registry.registerMeshBannerImageApertureAdder("Option", "addAperture");
        registry.registerLandscapeBusinnessCardTextApertureAdder("Option", "addAperture");
        registry.registerLandscapeBusinnessCardImageApertureAdder("Option", "addAperture");
        registry.registerPortraitBusinnessCardTextApertureAdder("Option", "addAperture");
        registry.registerPortraitBusinnessCardImageApertureAdder("Option", "addAperture");
        registry.registerIvoryBusinnessCardTextApertureAdder("Option", "addAperture");
        registry.registerIvoryBusinnessCardImageApertureAdder("Option", "addAperture");
        registry.registerGrayBusinnessCardTextApertureAdder("Option", "addAperture");
        registry.registerGrayBusinnessCardImageApertureAdder("Option", "addAperture");
        registry.registerWhiteBusinnessCardTextApertureAdder("Option", "addAperture");
        registry.registerWhiteBusinnessCardImageApertureAdder("Option", "addAperture");
        registry.registerLaidBusinnessCardTextApertureAdder("Option", "addAperture");
        registry.registerLaidBusinnessCardImageApertureAdder("Option", "addAperture");
        registry.registerLinenBusinnessCardTextApertureAdder("Option", "addAperture");
        registry.registerLinenBusinnessCardImageApertureAdder("Option", "addAperture");
        registry.registerSmoothBusinnessCardTextApertureAdder("Option", "addAperture");
        registry.registerSmoothBusinnessCardImageApertureAdder("Option", "addAperture");
        registry.registerSingleSidedBusinnessCardTextApertureAdder("Option", "addAperture");
        registry.registerSingleSidedBusinnessCardImageApertureAdder("Option", "addAperture");
        registry.registerDoubleSidedBusinnessCardTextApertureAdder("Option", "addAperture");
        registry.registerDoubleSidedBusinnessCardImageApertureAdder("Option", "addAperture");
    }
}
