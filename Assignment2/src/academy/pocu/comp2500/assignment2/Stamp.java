package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {
    private StempSizeType type;

    public Stamp(StempColorType stampColor, StempSizeType stampSize) {
        super(stampSize.getSize(), stampColor.getColor(), stampSize.getPrice());
        this.type = stampSize;
        setWidth(type.getWidth());
        setHeight(type.getHeight());
        setColor(stampColor.getColor());
    }

}