package academy.pocu.comp2500.assignment4;

import java.util.LinkedHashSet;
import java.util.Stack;

public class CommandHistoryManager {
    private StatusCanvas status = new StatusCanvas();
    private Canvas canvas;
//    private LinkedHashSet<ICommend> undoComments = new LinkedHashSet<>();
    private Stack<ICommend> undoComments = new Stack<>();
    private Stack<ICommend> redoComments = new Stack<>();

    public CommandHistoryManager(Canvas canvas) {
        this.canvas = canvas;
    }

    public boolean execute(ICommend commend) {

        return undoComments.push(commend).execute(this.canvas);
//        return commend.execute(this.canvas);
    }

    public boolean canUndo() {
        return undoComments.empty() == false;
    }

    public boolean canRedo() {
        return redoComments.empty() == false;
    }

    public void undo() {
       ICommend undo  = undoComments.pop();
       undo.undo();
       redoComments.push(undo);
    }

    public void redo() {
        ICommend redo = redoComments.pop();
        redo.redo();
        undoComments.push(redo);
    }

}
