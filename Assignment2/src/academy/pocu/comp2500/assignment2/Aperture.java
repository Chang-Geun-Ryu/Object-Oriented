package academy.pocu.comp2500.assignment2;

public class Aperture {
    protected String aperture;
    private int x;
    private int y;
//    private int width;
//    private int height;
//    private boolean sides;

    public Aperture(String aperture, int x, int y) {
        this.aperture = aperture;
        this.x = x;
        this.y = y;
//        this.width = width;
//        this.height = height;
    }

    public String getAperture() {
        return this.aperture;
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
