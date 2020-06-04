package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {
    private String text;
    private int width;
    private int height;

    public Stamp(String text, StempColorType stampColor, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
//        super(stampColor.getColor(), stampSize.getPrice(), deliveryMethod);
        super();
        assert stampColor != null : "stampColor must not be null";
        assert stampSize != null : "stampSize must not be null";
        assert deliveryMethod != null: "deliveryMethod must not be null";

        setName("Stamp" + stampSize.getSize());
        this.text = text;
//        this.sizeType = stampSize;
        this.width = stampSize.getWidth();
        this.height = stampSize.getHeight();
    }

    public void setText(String text) {
        this.text = text;
    }

//    public void setColor(StempColorType stampColor) {
//        setColor(stampColor.getColor());
//    }

    public String getText() {
        return this.text;
    }

//    public StempSizeType getSizeType() {
//        return this.sizeType;
//    }

    public int getWidth () {
        return this.width;
    }

    public int getHeight() {
        return this.height;
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
