package academy.pocu.comp2500.assignment2;

public class Image extends Aperture {
    private int width;
    private int height;

    public Image(String imagePath, int x, int y, int width, int height) {
        super(imagePath, x, y);//, width, height);
        this.width = width;
        this.height = height;
    }

    public String getImagePath() {
        return super.text;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
