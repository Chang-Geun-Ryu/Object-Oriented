package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {
    private String text;
    private int width;
    private int height;

    public Stamp(String text, StempColorType stampColor, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
//        super(stampColor.getColor(), stampSize.getPrice(), deliveryMethod);
        super();

        setColor(stampColor.getColor());

        if (stampSize == null) {
            setName("Stamp" + StempSizeType.FOUR_BY_THREE.getSize());
            this.width = StempSizeType.FOUR_BY_THREE.getWidth();
            this.height = StempSizeType.FOUR_BY_THREE.getHeight();
            setPrice(StempSizeType.FOUR_BY_THREE.getPrice());
        } else {
            setName("Stamp" + stampSize.getSize());
            this.width = stampSize.getWidth();
            this.height = stampSize.getHeight();
            setPrice(stampSize.getPrice());
        }

        if (deliveryMethod == null) {
            setShippingOptions(ShippingOptionsType.PICKUP);
        } else {
            setShippingOptions(deliveryMethod);
        }

        this.text = text;
//        this.sizeType = stampSize;

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
