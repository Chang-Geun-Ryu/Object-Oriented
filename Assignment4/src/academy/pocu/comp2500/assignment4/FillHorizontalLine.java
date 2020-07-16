package academy.pocu.comp2500.assignment4;

public class FillHorizontalLine implements ICommend {
    private int y;
    private char c;

    public FillHorizontalLine(int y, char character) {
        this.y = y;
        this.c = character;
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