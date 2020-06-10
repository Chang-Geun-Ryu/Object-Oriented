package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {
    private String text;
    private StempSizeType size;
//    private StempColorType color;

    protected Stamp(String text, StempColorType stampColor, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super();

//        this.color = stampColor;

        if (stampSize == null) {
            setName("Stamp" + StempSizeType.FOUR_BY_THREE.getSize());
            setPrice(StempSizeType.FOUR_BY_THREE.getPrice());
            this.size = StempSizeType.FOUR_BY_THREE;
        } else {
            setName("Stamp" + stampSize.getSize());
            setPrice(stampSize.getPrice());
            this.size = stampSize;
        }

        if (deliveryMethod == null) {
            setShippingOptions(ShippingOptionsType.PICKUP);
        } else {
            setShippingOptions(deliveryMethod);
        }

        if (text == null) {
            this.text = "";
        } else {
            this.text = text;
        }

        setColor(stampColor.getColor());
    }

    public void setText(String text) {
        this.text = text;
    }
//
//    public void setSize(StempSizeType size) {
//        if (size != null) {
//            this.size = size;
//            setPrice(size.getPrice());
//        }
//    }

    public String getText() {
        return this.text;
    }

//    public StempColorType getColor() {
//        return this.color;
//    }

    public int getWidth() {
        return this.size.getWidth();
    }

    public int getHeight() {
        return this.size.getHeight();
    }
}

