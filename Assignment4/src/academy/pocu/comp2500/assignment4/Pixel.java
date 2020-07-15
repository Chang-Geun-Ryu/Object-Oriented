package academy.pocu.comp2500.assignment4;

import java.util.Objects;

public class Pixel {
    private int x;
    private int y;
    private char value;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
        this.value = 0x20;
    }

    public Pixel(int x, int y, char value) {
        this(x, y);
        if (value >= 0x20 && value <= 0x7E) {
            this.value = value;
        }
    }

    public void setValue(char value) {
        this.value = value;
    }

    public char getValue() {
        return this.value;
    }

    public boolean increase() {
        if (this.value < 0x7F) {
            this.value += 1;
            return true;
        }
        return false;
    }

    public boolean decrease() {
        if (this.value > 0x20) {
            this.value -= 1;
            return true;
        }
        return false;
    }

    public void toUpper() {
        if (this.value >= 0x41 && this.value <= 0x5A) {
            this.value ^= 0x20;
        }
    }

    public void toLower() {
        if (this.value >= 0x61 && this.value < 0x7A) {
            this.value ^= 0x20;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Pixel pixel = (Pixel) o;
        return x == pixel.x &&
                y == pixel.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }
}
