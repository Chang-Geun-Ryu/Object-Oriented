package academy.pocu.comp2500.assignment4;

import java.util.ArrayList;
import java.util.HashSet;

public class Canvas {
    private int width;
    private int height;

    private HashSet<Pixel> pixels = new HashSet<>();

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;

        for (int w = 0; w < width; ++w) {
            for (int h = 0; h < height; ++height) {
//                this.pixels.add(new Pixel(w, h));
            }
        }
    }

    public void drawPixel(int x, int y, char character) {
        this.pixels.add(new Pixel(x, y, character));
    }

    public char getPixel(int x, int y) {
        this.
    }
}
