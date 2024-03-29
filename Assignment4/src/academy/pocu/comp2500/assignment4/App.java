package academy.pocu.comp2500.assignment4;

import academy.pocu.comp2500.assignment4.registry.Registry;

public class App {
    public App(Registry registry) {
        // Register like this
        // registry.registerDrawPixelCommandCreator("Foo");
        // OR
        // registry.registerDrawPixelCommandCreator("Foo", "bar");

        registry.registerDrawPixelCommandCreator("DrawPixel");
        registry.registerIncreasePixelCommandCreator("IncreasePixel");
        registry.registerDecreasePixelCommandCreator("DecreasePixel");
        registry.registerToUppercaseCommandCreator("ToUpper");
        registry.registerToLowercaseCommandCreator("ToLower");
        registry.registerFillHorizontalLineCommandCreator("FillHorizontalLine");
        registry.registerFillVerticalLineCommandCreator("FillVericalLine");
        registry.registerClearCommandCreator("ClearCanvas");
    }
}
