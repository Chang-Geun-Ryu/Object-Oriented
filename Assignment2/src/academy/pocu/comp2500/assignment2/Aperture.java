package academy.pocu.comp2500.assignment2;

public class Aperture {
    protected String text;
    private int x;
    private int y;
//    private int width;
//    private int height;
//    private boolean sides;

    public Aperture(String text, int x, int y) {
        this.text = text;
        this.x = x;
        this.y = y;
//        this.width = width;
//        this.height = height;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

//    public int getWidth() {
//        return this.width;
//    }
//
//    public int getHeight() {
//        return this.height;
//    }
}
