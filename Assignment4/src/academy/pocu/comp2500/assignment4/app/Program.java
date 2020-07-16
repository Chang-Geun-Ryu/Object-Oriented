package academy.pocu.comp2500.assignment4.app;

import academy.pocu.comp2500.assignment4.Canvas;

public class Program {

    public static void main(String[] args) {
	    // write your code here
        Canvas canvas = new Canvas(10, 10);

        canvas.drawPixel(0, 0, '*');
        canvas.drawPixel(1, 2, '$');
        canvas.drawPixel(0, 1, '&');

        canvas.fillHorizontalLine(5, 'A');
        canvas.fillVerticalLine(7, 'B');

        canvas.increasePixel(7, 5);

        canvas.decreasePixel(7, 5);

        canvas.toLower(7, 5);

        System.out.println(canvas.getDrawing());
    }
}
