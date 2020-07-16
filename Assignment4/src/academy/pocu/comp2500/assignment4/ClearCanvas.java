package academy.pocu.comp2500.assignment4;

public class ClearCanvas implements ICommend {
    @Override
    public boolean execute(Canvas canvas) {
        canvas.clear();
        return true;
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
