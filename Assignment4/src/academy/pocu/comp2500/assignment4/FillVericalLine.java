package academy.pocu.comp2500.assignment4;

public class FillVericalLine implements ICommend {
    private int x;
    private char c;

    public FillVericalLine(int x, char character) {
        this.x = x;
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