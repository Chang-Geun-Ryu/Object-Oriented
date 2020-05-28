package academy.pocu.comp2500.assignment2;

public enum StempColorType {
    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#008000");

    final private String color;

    public String getColor() {
        return color;
    }

    private StempColorType(String color){
        this.color = color;
    }
}