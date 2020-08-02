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
/*
        1. drawPixel(4, 4, a)
        2. toLowercase(0, 0)
        3. drawPixel(2, 4, n)
        4. redo
        5. clear()
        6. decreasePixel(4, 3)
        7. toUppercase(3, 0)
        8. increasePixel(3, 0)
        9. redo
        10. clear()
        11. fillVerticalLine(0, g)
        12. fillVerticalLine(3, A)
        13. decreasePixel(2, 0)
        14. toLowercase(1, 2)
        15. clear()
        16. redo
        17. fillHorizontalLine(1, J)
        18. toLowercase(4, 1)
        19. toUppercase(0, 2)
        20. undo
*/
//        manager.execute(new IncreasePixel(3, 1)); // 1
//        manager.execute(new IncreasePixel(1, 3));
//        manager.undo();
//        manager.execute(new DrawPixel(4, 4, 'p'));
//        manager.execute(new FillVericalLine(3, 'Z')); // 1
//        manager.execute(new ToUpper(0, 4));
//        manager.execute(new IncreasePixel(4, 3));
//        manager.execute(new DecreasePixel(3, 2));
//        manager.execute(new DrawPixel(1, 4, '?'));
//        manager.execute(new FillVericalLine(2, (char)0x5C));
//        manager.execute(new DrawPixel(3, 2, 'w'));
//        manager.execute(new ToUpper(0, 0));
//        manager.execute(new DecreasePixel(4, 1));
//        manager.execute(new ToLower(1, 2));
//        manager.execute(new DrawPixel(1, 3, '+'));
//        manager.execute(new ToLower(2, 3));
//        manager.execute(new ToLower(3, 1)); // 1
//        manager.undo();                             // 1
//        manager.execute(new ClearCanvas());         // 1
//        manager.execute(new IncreasePixel(4, 2));

        OverdrawAnalyzer canvas = new OverdrawAnalyzer(30, 25);
        CommandHistoryManager manager = new CommandHistoryManager(canvas);

        manager.execute(new DrawPixel(4,4,'a'));
        manager.execute(new ToLower(0,0));
        manager.execute(new DrawPixel(2,4,'n'));
        manager.redo();
        manager.execute(new ClearCanvas());
        manager.execute(new DecreasePixel(4, 3));
        manager.execute(new ToUpper(3, 0));
        manager.execute(new IncreasePixel(3, 0));
        manager.redo();
        manager.execute(new ClearCanvas());
        manager.execute(new FillVericalLine(0, 'g')); // 1
        manager.execute(new FillVericalLine(3, 'A'));
        manager.execute(new DecreasePixel(2,0));
        manager.execute(new ToLower(1, 2));
        manager.execute(new ClearCanvas()); // 2
        manager.redo();
        manager.execute(new FillHorizontalLine(1, 'J'));
        manager.execute(new ToLower(4, 1));
        manager.execute(new ToUpper(0, 2));
        manager.undo();

        System.out.println(canvas.getOverdrawCount(0, 2));
        System.out.println(canvas.getOverdrawCount());

//                System.out.println(canvas.getDrawing());

    }
}
