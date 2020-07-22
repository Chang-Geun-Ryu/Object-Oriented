package academy.pocu.comp2500.assignment4.app;

import academy.pocu.comp2500.assignment4.*;
import academy.pocu.comp2500.assignment4.registry.Registry;

public class Program {

    public static void main(String[] args) {
	    // write your code here
        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();

        Canvas canvas = new Canvas(30, 25);
        CommandHistoryManager manager = new CommandHistoryManager(canvas);

        manager.undo();
        manager.undo();
        manager.execute(new ToLower(3, 14));
        manager.execute(new DecreasePixel(10, 10));
        manager.execute(new ClearCanvas());
        manager.execute(new DrawPixel(15, 17, '!'));
        manager.undo();
        manager.execute(new FillVericalLine(25, 'p'));
        manager.redo();

        System.out.println(canvas.getDrawing());

    }
}
