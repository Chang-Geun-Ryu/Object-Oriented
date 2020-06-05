package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.parent.Stamp;

public class GreenStamp extends Stamp {
    public GreenStamp(String text, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(text, StempColorType.GREEN, stampSize, deliveryMethod);
    }
}
