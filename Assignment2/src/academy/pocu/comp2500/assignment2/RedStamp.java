package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.parent.Stamp;

public class RedStamp extends Stamp {
    public RedStamp(String text, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(text, StempColorType.RED, stampSize, deliveryMethod);
    }
}
