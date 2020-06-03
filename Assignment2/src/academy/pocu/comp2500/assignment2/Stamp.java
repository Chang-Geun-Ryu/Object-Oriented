package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {
    private String textAperture;

    public Stamp(String text, StempColorType stampColor, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(stampSize.getSize(), stampColor.getColor(), stampSize.getPrice(), deliveryMethod);
        setWidth(stampSize.getWidth());
        setHeight(stampSize.getHeight());
        setName("Stamp");
        this.textAperture = text;
    }

    public void setText(String text) {
        this.textAperture = text;
    }

    public void setColor(StempColorType stampColor) {
        setColor(stampColor.getColor());
    }

    public String getTextAperture() {
        return this.textAperture;
    }
}

final class BlueStamp extends Stamp {
    public BlueStamp(String textAperture, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(textAperture, StempColorType.BLUE, stampSize, deliveryMethod);
    }
}

final class RedStamp extends Stamp {
    public RedStamp(String textAperture, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(textAperture, StempColorType.RED, stampSize, deliveryMethod);
    }
}

final class GreenStamp extends Stamp {
    public GreenStamp(String textAperture, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super(textAperture, StempColorType.GREEN, stampSize, deliveryMethod);
    }
}
