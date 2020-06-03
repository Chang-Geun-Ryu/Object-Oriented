package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {
    private String text;
    private StempSizeType sizeType;

    public Stamp(String text, StempColorType stampColor, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
//        super(stampSize.getSize(), stampColor.getColor(), stampSize.getPrice(), deliveryMethod);
        super(stampColor.getColor(), stampSize.getPrice(), deliveryMethod);
//        setWidth(stampSize.getWidth());
//        setHeight(stampSize.getHeight());
        setName("Stamp" + stampSize.getSize());
        this.text = text;
        this.sizeType = stampSize;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setColor(StempColorType stampColor) {
        setColor(stampColor.getColor());
    }

    public String getText() {
        return this.text;
    }

    public StempSizeType getSizeType() {
        return this.sizeType;
    }
}

final class BlueStamp extends Stamp {
    public BlueStamp(String text, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(text, StempColorType.BLUE, stampSize, deliveryMethod);
    }
}

final class RedStamp extends Stamp {
    public RedStamp(String text, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(text, StempColorType.RED, stampSize, deliveryMethod);
    }
}

final class GreenStamp extends Stamp {
    public GreenStamp(String text, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(text, StempColorType.GREEN, stampSize, deliveryMethod);
    }
}
