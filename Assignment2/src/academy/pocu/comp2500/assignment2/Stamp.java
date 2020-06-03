package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {

    public Stamp(StempColorType stampColor, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(stampSize.getSize(), stampColor.getColor(), stampSize.getPrice(), deliveryMethod);
        setWidth(stampSize.getWidth());
        setHeight(stampSize.getHeight());
        setName("Stamp");
    }
}

final class BlueStamp extends Stamp {
    public BlueStamp(StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(StempColorType.BLUE, stampSize, deliveryMethod);
    }
}

final class RedStamp extends Stamp {
    public RedStamp(StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(StempColorType.RED, stampSize, deliveryMethod);
    }
}

final class GreenStamp extends Stamp {
    public GreenStamp(StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(StempColorType.GREEN, stampSize, deliveryMethod);
    }
}
