package academy.pocu.comp2500.assignment4.app;

import academy.pocu.comp2500.assignment4.*;
import academy.pocu.comp2500.assignment4.registry.Registry;

public class Program {

    public static void main(String[] args) {
	    // write your code here
        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();

//        Canvas canvas = new Canvas(30, 25);
//        CommandHistoryManager manager = new CommandHistoryManager(canvas);
//
//
//        manager.execute(new FillHorizontalLine(4, (char)0x5C));
//        manager.execute(new FillVericalLine(3, '3'));
//        manager.execute(new ClearCanvas());
//        manager.execute(new ToLower(15, 3));
//        manager.execute(new FillHorizontalLine(14, ')'));
//        manager.redo();
//        manager.execute(new ToLower(20, 3));
//        manager.execute(new ClearCanvas());
//        manager.execute(new FillHorizontalLine(19, 'm'));
//        manager.execute(new DecreasePixel(18, 2));
//        manager.execute(new ToUpper(13, 6));
//        manager.execute(new FillVericalLine(26, 'I'));
//        manager.execute(new IncreasePixel(2, 7));
//        manager.execute(new ClearCanvas());
//        manager.execute(new IncreasePixel(7, 18));
//        manager.execute(new ToLower(27, 24));
//        manager.execute(new FillVericalLine(1, '7'));
//        manager.execute(new IncreasePixel(18, 18));
//        manager.execute(new DecreasePixel(10, 12));
//        manager.undo();

        OverdrawAnalyzer canvas = new OverdrawAnalyzer(30, 25);
        CommandHistoryManager manager = new CommandHistoryManager(canvas);
        manager.execute(new ClearCanvas());
        manager.execute(new FillVericalLine(1, '.'));
        manager.execute(new IncreasePixel(0, 3));
        manager.execute(new ToUpper(1, 0));
        manager.execute(new FillHorizontalLine(4, 'X'));
        manager.execute(new FillHorizontalLine(4, 'V'));
//        canvas.clear();
//        canvas.fillVerticalLine(1, '.');
//        canvas.increasePixel(0, 3);
//        canvas.toUpper(1, 0);
//        canvas.fillHorizontalLine(4, 'x');
//        canvas.fillHorizontalLine(4, 'v');
//        canvas.fillVerticalLine(4, 't');
//        canvas.increasePixel(4, 2);


                System.out.println(canvas.getDrawing());

    }
}
