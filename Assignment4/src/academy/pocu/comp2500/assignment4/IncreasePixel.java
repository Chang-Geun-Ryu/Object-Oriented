package academy.pocu.comp2500.assignment4;

public class IncreasePixel implements ICommend {
    private int x;
    private int y;
    private char beforeValue;
    private char afterValue;
    private Canvas canvas;
    private int status;

    public IncreasePixel(int x, int y) {
        this.x = x;
        this.y = y;
        this.status = 0;
    }

    @Override
    public boolean execute(Canvas canvas) {
        if (this.status != 0) {
            return false;
        }

        this.beforeValue = canvas.getPixel(x, y);
        canvas.increasePixel(x, y);
        this.afterValue = canvas.getPixel(x, y);

        this.canvas = canvas;
        this.status = 1;
        return true;
    }

    @Override
    public boolean undo() {
        if (this.status != 1) {
            return false;
        }

        canvas.drawPixel(x, y, beforeValue);
        this.status = 2;
        return true;
    }

    @Override
    public boolean redo() {
        if (this.status != 2) {
            return false;
        }

        canvas.drawPixel(x, y, afterValue);
        this.status = 1;
        return true;
    }
}