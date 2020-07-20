package academy.pocu.comp2500.assignment4;

public class DrawPixel implements ICommand {
    private int x;
    private int y;
    private char beforeValue;
    private char afterValue;
    private int status;
    private Canvas canvas;

    public DrawPixel(int x, int y, char character) {
        this.x = x;
        this.y = y;
        this.afterValue = character;
        this.beforeValue = 0x00;
        this.status = 0;
    }

    @Override
    public boolean execute(Canvas canvas) {
        if (this.status != 0) {
            return false;
        }

        this.beforeValue = canvas.getPixel(x, y);
        canvas.drawPixel(x, y, afterValue);
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

        this.canvas.drawPixel(x, y, afterValue);
        this.status = 1;
        return true;
    }
}