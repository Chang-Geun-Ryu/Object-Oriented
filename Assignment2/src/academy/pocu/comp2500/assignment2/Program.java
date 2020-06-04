package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Program {

    public static void main(String[] args) {
	    // write your code here

        BlueStamp bStamp = new BlueStamp("textStemp", StempSizeType.FIVE_BY_TWO, ShippingOptionsType.PICKUP);

        System.out.println("price: " + bStamp.getPrice());
        System.out.print("getColor: ");
        System.out.println(bStamp.getColor());
        System.out.println("getHeight: " + bStamp.getHeight());
        System.out.println("getName: " + bStamp.getName());
//        System.out.println("getSize: " + bStamp.getSize());
        System.out.println("getWidth: " + bStamp.getWidth());
        System.out.print("delivery: ");
        System.out.println(bStamp.getShippingOptions());

        System.out.println("getText: " + bStamp.getText());

        Cart cart = new Cart();
        cart.addProduct(bStamp);

//        Method[] methods = bStamp.getClass().getMethods();
//
//        for (Method m : methods) {
//            System.out.printf(" - %s%s", m.getName(), System.lineSeparator());
//        }
//
//        System.out.printf("# methods: %d%s", methods.length, System.lineSeparator());

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
