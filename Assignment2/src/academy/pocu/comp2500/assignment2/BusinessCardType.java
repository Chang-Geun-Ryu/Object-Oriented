package academy.pocu.comp2500.assignment2;

public enum BusinessCardType {
    LINEN("Linen Business Card", 90, 50, 110),
    LAID("Laid Business Card", 90, 50,  120),
    SMOOTH("Smooth Business Card", 90, 50, 100);

    final private String nameCard;

    final private int width;
    final private int height;
    final private int price;


    public String getNameCard() {
        return nameCard;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int getPrice() {
        return price;
    }


    private BusinessCardType(String nameCard, int width, int height, int price){
        this.nameCard = nameCard;
        this.width = width;
        this.height = height;
        this.price = price;
    }
}
