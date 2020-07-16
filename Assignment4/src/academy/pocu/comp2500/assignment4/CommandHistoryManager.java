package academy.pocu.comp2500.assignment4;

import java.util.LinkedHashSet;

public class CommandHistoryManager {
    private Canvas canvas;
    private LinkedHashSet<ICommend> commends = new LinkedHashSet<>();

    public CommandHistoryManager(Canvas canvas) {
        this.canvas = canvas;
    }

    public boolean execute(ICommend commend) {
        commends.add(commend);
        return commend.execute(this.canvas);
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
