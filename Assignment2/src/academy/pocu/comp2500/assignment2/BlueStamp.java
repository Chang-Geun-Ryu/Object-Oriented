package academy.pocu.comp2500.assignment2;
import academy.pocu.comp2500.assignment2.parent.Stamp;

public class BlueStamp extends Stamp {
    public BlueStamp(String text, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(text, StempColorType.BLUE, stampSize, deliveryMethod);
    }
}
