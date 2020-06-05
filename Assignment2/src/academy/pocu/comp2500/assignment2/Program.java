package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.parent.Stamp;
import academy.pocu.comp2500.assignment2.registry.Registry;
import academy.pocu.comp2500.assignment2.type.ShippingOptionsType;
import academy.pocu.comp2500.assignment2.type.StempSizeType;

public class Program {

    public static void main(String[] args) {
	    // write your code here

//        Stamp bStamp =  new Stamp().blueStamp("textStemp", StempSizeType.FIVE_BY_TWO, ShippingOptionsType.PICKUP);
        Stamp bStamp = new BlueStamp("textStemp", StempSizeType.FIVE_BY_TWO, ShippingOptionsType.PICKUP);
//        bStamp.blueStamp("textStemp", StempSizeType.FIVE_BY_TWO, ShippingOptionsType.PICKUP);

        System.out.println("price: " + bStamp.getPrice());
        System.out.print("getColor: ");
        System.out.println(bStamp.getColor());
        System.out.println("getName: " + bStamp.getName());
        System.out.println("getSize: " + bStamp.getSize());
        System.out.print("delivery: ");
        System.out.println(bStamp.getShippingOptions());
        System.out.println("getText: " + bStamp.getText());

        Cart cart = new Cart();
        cart.addProduct(bStamp);

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
