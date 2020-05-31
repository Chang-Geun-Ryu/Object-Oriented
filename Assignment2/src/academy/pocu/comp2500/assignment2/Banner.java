package academy.pocu.comp2500.assignment2;

public class Banner extends Product {
    private OrientationType orientation;

    public Banner(BannerType type, BannerSize size, String color, OrientationType orientation) {
        super(size.getSize(), color, size.getPrice());
        this.orientation = orientation;

        setWidth(size.getWidth());
        setHeight(size.getHeight());
        setName(type.getName());

    }

    public void setOrientation(OrientationType orientation) {
        this.orientation = orientation;
    }

    public OrientationType getOrientation() {
        return this.orientation;
    }


}
