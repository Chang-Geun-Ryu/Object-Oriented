package academy.pocu.comp2500.assignment2;

public enum BusinessCardColor {
    GRAY("#FF0000"),
    IVORY("#0000FF"),
    WHITE("#008000");

    final private String color;
    public String getColor() {
        return color;
    }
    private BusinessCardColor(String name){
        this.color = name;
    }
}
