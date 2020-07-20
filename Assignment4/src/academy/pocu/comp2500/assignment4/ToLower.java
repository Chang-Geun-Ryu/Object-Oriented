package academy.pocu.comp2500.assignment4;

public class ToLower implements ICommend {
    private int x;
    private int y;
    private char beforeValue;
    private Canvas canvas;
    private int status;

    public ToLower(int x, int y) {
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
        canvas.toLower(x, y);

        this.canvas = canvas;
        this.status = 1;
        return true;
    }

    @Override
    public boolean undo() {
        if (this.status != 1) {
            return false;
        }

        this.canvas.drawPixel(x, y, beforeValue);
        this.status = 2;
        return true;
    }

    @Override
    public boolean redo() {
        if (this.status != 2) {
            return false;
        }

        this.canvas.toLower(x, y);
        this.status = 1;
        return true;
    }
}