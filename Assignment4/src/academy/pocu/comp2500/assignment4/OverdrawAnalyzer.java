package academy.pocu.comp2500.assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class OverdrawAnalyzer extends Canvas {
    private HashMap<Integer, LinkedList<Character>> history = new HashMap<>();

    public OverdrawAnalyzer(int width, int height) {
        super(width, height);

        for (int w = 0; w < width; ++w) {
            for (int h = 0; h < height; ++h) {
                LinkedList<Character> linked = new LinkedList<>();
                linked.add(getPixel(w, h));
                this.history.put(Objects.hash(w, h), linked);
            }
        }
    }

    public LinkedList<Character> getPixelHistory(int x, int y) {
        return this.history.get(Objects.hash(x, y));
    }

    public int getOverdrawCount(int x, int y) {

        return getPixelHistory(x, y).size() - 1;
    }

    public int getOverdrawCount() {
        int total = 0;
        for (int y = 0; y < getHeight(); ++y) {
            for (int x = 0; x <getWidth(); ++x) {
                total += getOverdrawCount(x, y);
            }
        }
        return total;
    }

    // Override
    @Override
    public void drawPixel(int x, int y, char character) {
        super.drawPixel(x, y, character);

        if (getPixelHistory(x, y).getLast() != character) {
            getPixelHistory(x, y).add(character);
        }
    }

    @Override
    public boolean increasePixel(int x, int y) {
        if (super.increasePixel(x, y)) {
            if (getPixelHistory(x, y).getLast() != getPixel(x, y)) {
                getPixelHistory(x, y).add(getPixel(x, y));
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean decreasePixel(int x, int y) {
        if (super.decreasePixel(x, y)) {
            if (getPixelHistory(x, y).getLast() != getPixel(x, y)) {
                getPixelHistory(x, y).add(getPixel(x, y));
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void toUpper(int x, int y) {
        super.toUpper(x, y);

        if (getPixelHistory(x, y).getLast() != getPixel(x, y)) {
            getPixelHistory(x, y).add(getPixel(x, y));
        }
    }

    @Override
    public void toLower(int x, int y) {
        super.toLower(x, y);

        if (getPixelHistory(x, y).getLast() != getPixel(x, y)) {
            getPixelHistory(x, y).add(getPixel(x, y));
        }
    }

    @Override
    public void fillHorizontalLine(int y, char character) {
        super.fillHorizontalLine(y, character);

        for (int x = 0; x <getWidth(); ++x) {
            if (getPixelHistory(x, y).getLast() != getPixel(x, y)) {
                getPixelHistory(x, y).add(getPixel(x, y));
            }
        }
    }

    @Override
    public void fillVerticalLine(int x, char character) {
        super.fillVerticalLine(x, character);

        for (int y = 0; y < getHeight(); ++y) {
            if (getPixelHistory(x, y).getLast() != getPixel(x, y)) {
                getPixelHistory(x, y).add(getPixel(x, y));
            }
        }
    }

    @Override
    public void clear() {
        super.clear();
        for (int y = 0; y < getHeight(); ++y) {
            for (int x = 0; x <getWidth(); ++x) {
                if (getPixelHistory(x, y).getLast() != getPixel(x, y)) {
                    getPixelHistory(x, y).add(getPixel(x, y));
                }
            }
        }
    }
}
