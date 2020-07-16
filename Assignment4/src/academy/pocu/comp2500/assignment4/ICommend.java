package academy.pocu.comp2500.assignment4;

public interface ICommend {
    boolean execute(Canvas canvas);
    boolean undo();
    boolean redo();
}
