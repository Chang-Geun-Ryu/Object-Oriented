package academy.pocu.comp2500.assignment2;

public class Stemp extends Product {
    private StempSizeType type;
    private String text;

    public Stemp(StempColorType stampColor, StempSizeType stampSize, String text) {
        super("Stamp", stampSize.getSize(), stampColor.getColor(), stampSize.getPrice());
        this.type = stampSize;
        this.text = text;
        setWidth(type.getWidth());
        setHeight(type.getHeight());
        setColor(stampColor.getColor());
//        setUp(type);
    }
//
//    private void setUp(StempSizeType type) {
//        if (StempSizeType.SEVEN_BY_FOUR == type) {
//            setSize("70 mm x 40 mm");
//            setPrice(2600);
//        } else if (StempSizeType.FIVE_BY_TWO == type){
//            setSize("50 mm x 20 mm");
//            setPrice(2300);
//        } else if (StempSizeType.FOUR_BY_THREE == type) {
//            setSize("40 mm x 30 mm");
//            setPrice(2300);
//        } else {
//            assert false;
//        }
//    }

    public String getText() {
        return this.text;
    }
}