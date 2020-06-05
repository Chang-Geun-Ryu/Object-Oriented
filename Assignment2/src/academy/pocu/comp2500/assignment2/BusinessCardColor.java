package academy.pocu.comp2500.assignment2;

public enum BusinessCardColor {
    GRAY(0xFF0000),
    IVORY(0x0000FF),
    WHITE(0x008000);

    final private int color;
    public int getColor() {
        return color;
    }
    private BusinessCardColor(int name){
        this.color = name;
    }
}
