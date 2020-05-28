package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {
    private StempSizeType type;
    private String text;

    public Stamp(StempColorType stampColor, StempSizeType stampSize, String text) {
        super(stampSize.getSize(), stampColor.getColor(), stampSize.getPrice());
        this.type = stampSize;
        this.text = text;
        setWidth(type.getWidth());
        setHeight(type.getHeight());
        setColor(stampColor.getColor());
    }

}