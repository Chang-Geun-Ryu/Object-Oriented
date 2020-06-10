package academy.pocu.comp2500.assignment2;

public class Aperture {
    private String element;
    private int x;
    private int y;
//    private int width;
//    private int height;
//    private boolean sides;

    public Aperture(String element, int x, int y) {
        this.element = element;
        this.x = x;
        this.y = y;
//        this.width = width;
//        this.height = height;
    }

    public String getElemnet() {
        return this.element;
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
