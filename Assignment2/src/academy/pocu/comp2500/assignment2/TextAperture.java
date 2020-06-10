package academy.pocu.comp2500.assignment2;

public class TextAperture extends Aperture {
    public TextAperture(String text, int x, int y, int width, int height) {
        super(text, x, y, width, height);
    }

    public String getText() {
        return super.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
