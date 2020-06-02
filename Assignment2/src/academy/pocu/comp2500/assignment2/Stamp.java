package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {
    private StempSizeType type;

    public Stamp(StempColorType stampColor, StempSizeType stampSize) {
        super(stampSize.getSize(), stampColor.getColor(), stampSize.getPrice());
        this.type = stampSize;
        setWidth(type.getWidth());
        setHeight(type.getHeight());
        setColor(stampColor.getColor());
        setName("Stamp");
    }
}

final class BlueStamp extends Stamp {
    public BlueStamp(StempSizeType stampSize) {
        super(StempColorType.BLUE, stampSize);
    }
}

final class RedStamp extends Stamp {
    public RedStamp(StempSizeType type) {
        super(StempColorType.RED, type);
    }
}

final class GreenStamp extends Stamp {
    public GreenStamp(StempSizeType type) {
        super(StempColorType.GREEN, type);
    }
}
