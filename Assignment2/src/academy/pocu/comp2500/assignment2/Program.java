package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;

public class Program {

    public static void main(String[] args) {
	    // write your code here

        BlueStamp bStamp = new BlueStamp("textStemp", StempSizeType.FIVE_BY_TWO, ShippingOptionsType.PICKUP);

        System.out.println("price: " + bStamp.getPrice());
        System.out.print("getColor: ");
        System.out.println(bStamp.getColor());
        System.out.println("getHeight: " + bStamp.getHeight());
        System.out.println("getName: " + bStamp.getName());
        System.out.println("getSize: " + bStamp.getSize());
        System.out.println("getWidth: " + bStamp.getWidth());
        System.out.print("delivery: ");
        System.out.println(bStamp.getShippingOptions());

        System.out.println("getText: " + bStamp.getTextAperture());

        bStamp.setColor(StempColorType.BLUE);

        Cart cart = new Cart();
        cart.addProduct(bStamp);


        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
