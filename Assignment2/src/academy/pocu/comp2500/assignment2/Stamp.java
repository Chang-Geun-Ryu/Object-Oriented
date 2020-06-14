package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {
    private String text;
//    private StempSizeType size;
    private StempColorType color;

    public Stamp(String text, StempColorType stampColor, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super();

        this.color = stampColor;
//        setColor(stampColor.getColor());

        if (stampSize == null) {
            setName("Stamp" + StempSizeType.FOUR_BY_THREE.getSize());
            setPrice(StempSizeType.FOUR_BY_THREE.getPrice());
//            this.size = StempSizeType.FOUR_BY_THREE;
        } else {
            setName("Stamp" + stampSize.getSize());
            setPrice(stampSize.getPrice());
//            this.size = stampSize;
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

        setWidth(stampSize.getWidth());
        setHeight(stampSize.getHeight());
    }

    public void setStampSize(StempSizeType stampSize) {
        setWidth(stampSize.getWidth());
        setHeight(stampSize.getHeight());
    }
//    public void setText(String text) {
//        this.text = text;
//    }

    public StempColorType getStampColor() {
         return this.color;
    }

    public String getText() {
        return this.text;
    }


}

