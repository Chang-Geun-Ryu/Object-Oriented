package academy.pocu.comp2500.assignment4;

public class DrawPixel implements ICommend {
    private int x;
    private int y;

    public DrawPixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean execute(Canvas canvas) {
        return false;
    }

    @Override
    public boolean undo() {
        return false;
    }

    @Override
    public boolean redo() {
        return false;
    }
}