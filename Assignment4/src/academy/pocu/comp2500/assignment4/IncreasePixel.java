package academy.pocu.comp2500.assignment4;

public class IncreasePixel implements ICommend {
    private int x;
    private int y;

    public IncreasePixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean execute(Canvas canvas) {
//        canvas.increasePixel(this.x, this.y);
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