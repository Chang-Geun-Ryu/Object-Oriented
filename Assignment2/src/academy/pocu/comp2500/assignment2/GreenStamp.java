package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.type.ShippingOptionsType;
import academy.pocu.comp2500.assignment2.type.StempColorType;
import academy.pocu.comp2500.assignment2.type.StempSizeType;

public class GreenStamp extends Stamp {
    public GreenStamp(String text, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(text, StempColorType.GREEN, stampSize, deliveryMethod);
    }
}
