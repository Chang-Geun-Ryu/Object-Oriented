package academy.pocu.comp2500.assignment4;

public class CommandHistoryManager {
    private Canvas canvas;
    public CommandHistoryManager(Canvas canvas) {
        this.canvas = canvas;
    }

    public boolean execute(ICommend commend) {
        return false;
    }

    public boolean canUndo() {
        return false;
    }

    public boolean canRedo() {
        return false;
    }

    public void undo() {
    }

    public void redo() {
    }
}
