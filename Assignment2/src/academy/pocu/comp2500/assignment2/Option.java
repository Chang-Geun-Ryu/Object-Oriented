package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Option extends Product {
    protected OrientationType orientation;
    private ArrayList<Aperture> apertures;
//    private ArrayList<ImageAperture> imagePaths;
//    protected int color;
//    private int width;
//    private int height;

    protected Option(OrientationType orientation) {
        this.orientation = orientation;
        this.apertures = new ArrayList<>();
//        this.imagePaths = new ArrayList<>();
    }

//    protected void setWidth(int width) {
//        this.width = width;
//    }
//
//    protected  void setHeight(int height) {
//        this.height = height;
//    }

//    protected void setColor(int color) {
//        this.color = color;
//    }

//    public int getColor() {
//        return this.color;
//    }

//    public OrientationType getOrientation() {
//        return this.orientation;
//    }

//    public void addText(TextAperture textAperture) {
//        this.texts.add(textAperture);
//        addPrice(textAperture);
//    }
//
//    public void addImage(ImageAperture imageAperture) {
//        this.imagePaths.add(imageAperture);
//        addPrice(imageAperture);
//    }

    public void addAperture(Aperture aperture) {
        this.apertures.add(aperture);
        addPrice(aperture);
    }

    public ArrayList<Aperture> getApertures() {
        return this.apertures;
    }

//    public void addAperture(Aperture aperture) {
//        this.texts.add(aperture);
//        addPrice(aperture);
//    }

    private void addPrice(Aperture aperture) {
        int w = this.orientation == OrientationType.LANDSCAPE ? this.width : this.height;
        int h = this.orientation == OrientationType.LANDSCAPE ? this.height : this.width;

        ArrayList<Integer> elements = aperture.getElements();
        int x = elements.get(0);
        int y = elements.get(1);
        int width = elements.get(2);
        int height = elements.get(3);

        if (x >= 0 && y >= 0 && x < w && y < h) {
            setPrice(getPrice() + 5);
        } else if (x < 0 || y < 0) {
            if (width + x > 0 || height + y > 0) {
                setPrice(getPrice() + 5);
            }
        }
    }
}
