package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {

    public Stamp(StempColorType stampColor, StempSizeType stampSize, ShippingOptionsType delivery) {
        super(stampSize.getSize(), stampColor.getColor(), stampSize.getPrice(), delivery);
        setWidth(stampSize.getWidth());
        setHeight(stampSize.getHeight());
        setName("Stamp");
    }
}

final class BlueStamp extends Stamp {
    public BlueStamp(StempSizeType stampSize, ShippingOptionsType delivery) {
        super(StempColorType.BLUE, stampSize, delivery);
    }
}

final class RedStamp extends Stamp {
    public RedStamp(StempSizeType stampSize, ShippingOptionsType delivery) {
        super(StempColorType.RED, stampSize, delivery);
    }
}

final class GreenStamp extends Stamp {
    public GreenStamp(StempSizeType stampSize, ShippingOptionsType delivery) {
        super(StempColorType.GREEN, stampSize, delivery);
    }
}
