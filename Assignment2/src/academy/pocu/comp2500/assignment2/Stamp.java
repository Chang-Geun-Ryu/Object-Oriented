package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {
    private String text;

    protected Stamp(String text, StempColorType stampColor, StempSizeType stampSize, ShippingOptionsType deliveryMethod) {
        super();
        setColor(stampColor.getColor());

        if (stampSize == null) {
            setName("Stamp" + StempSizeType.FOUR_BY_THREE.getSize());
            setPrice(StempSizeType.FOUR_BY_THREE.getPrice());
        } else {
            setName("Stamp" + stampSize.getSize());
            setPrice(stampSize.getPrice());
        }

        if (deliveryMethod == null) {
            setShippingOption(ShippingOptionsType.PICKUP);
        } else {
            setShippingOption(deliveryMethod);
        }

        if (text == null) {
            this.text = "";
        } else {
            this.text = text;
        }

        setWidth(stampSize.getWidth());
        setHeight(stampSize.getHeight());
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}

