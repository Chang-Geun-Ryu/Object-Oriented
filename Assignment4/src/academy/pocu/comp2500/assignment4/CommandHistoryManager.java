package academy.pocu.comp2500.assignment4;

import java.util.Stack;

public class CommandHistoryManager {
    private StatusCanvas status = new StatusCanvas();
    private Canvas canvas;
    private Stack<ICommand> undoComments = new Stack<>();
    private Stack<ICommand> redoComments = new Stack<>();

    public CommandHistoryManager(Canvas canvas) {
        this.canvas = canvas;
    }

    public boolean execute(ICommand commend) {
        redoComments.clear();
        return undoComments.push(commend).execute(this.canvas);
    }

    public boolean canUndo() {
        return undoComments.empty() == false;
    }

    public boolean canRedo() {
        return redoComments.empty() == false;
    }

    public void undo() {
        ICommand commend = undoComments.pop();
        commend.undo();
        redoComments.push(commend);
    }

    public void redo() {
        ICommand redo = redoComments.pop();
        redo.redo();
        undoComments.push(redo);
    }

}
