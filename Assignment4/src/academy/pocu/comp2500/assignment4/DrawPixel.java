package academy.pocu.comp2500.assignment4;

public class DrawPixel implements ICommend {
    private int x;
    private int y;
    private char undo;
    private char redo;
    private Canvas canvas;

    public DrawPixel(int x, int y, char character) {
        this.x = x;
        this.y = y;
        this.redo = character;
        this.undo = 0x00;
    }

    @Override
    public boolean execute(Canvas canvas) {
        this.undo = canvas.getPixel(x, y);
        canvas.drawPixel(x, y, redo);
        this.canvas = canvas;
        return false;
    }

    @Override
    public boolean undo() {
        if (this.undo == canvas.getPixel(x, y)) {
            return false;
        }

        this.canvas.drawPixel(x, y, undo);
        return true;
    }

    @Override
    public boolean redo() {
        if (this.redo == canvas.getPixel(x, y)) {
            return false;
        }

        this.canvas.drawPixel(x, y, redo);
        return true;
    }
}