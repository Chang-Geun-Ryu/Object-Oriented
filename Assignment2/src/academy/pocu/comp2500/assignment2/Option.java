package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Option extends Product {
    protected OrientationType orientation;
    private ArrayList<Aperture> apertures;
//    protected BusinessCardSide side;

    protected Option(OrientationType orientation) {
        this.orientation = orientation;
        this.apertures = new ArrayList<>();
//        this.side = BusinessCardSide.SINGLE;
    }

//    public int getColor() {
//        return this.color;
//    }
//
//    protected void setColor(int color) {
//        this.color = color;
//    }

    public void addAperture(Aperture aperture) {
        this.apertures.add(aperture);
        addPrice(aperture);
    }

    public ArrayList<Aperture> getApertures() {
        return this.apertures;
    }

    private void addPrice(Aperture aperture) {
        int w = this.orientation == OrientationType.LANDSCAPE ? this.width : this.height;
        int h = this.orientation == OrientationType.LANDSCAPE ? this.height : this.width;

        ArrayList<Integer> elements = aperture.getElements();
        int x = elements.get(0);
        int y = elements.get(1);
        int width = elements.get(2);//this.orientation == OrientationType.LANDSCAPE ? elements.get(2) : elements.get(3);
        int height = elements.get(3);//this.orientation == OrientationType.LANDSCAPE ? elements.get(3) : elements.get(2);

        if (x >= 0 && y >= 0 && x < w && y < h) {
            super.setPrice(super.getPrice() + 5);
        } else if (x < 0 || y < 0) {
            if (width + x > 0 || height + y > 0) {
                super.setPrice(super.getPrice() + 5);
            }
        }

//        if (this.side == BusinessCardSide.DOUBLE) {
//
//        }
    }
}
