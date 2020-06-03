package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;

public class Program {

    public static void main(String[] args) {
	    // write your code here

        BlueStamp bStamp = new BlueStamp(StempSizeType.FIVE_BY_TWO, ShippingOptionsType.PICKUP);

        System.out.println("price: " + bStamp.getPrice());
        System.out.print("getColor: ");
        System.out.println(bStamp.getColor());
        System.out.println("getHeight: " + bStamp.getHeight());
//        System.out.println("getImagePaths: " + bStamp.getImagePaths());
        System.out.println("getName: " + bStamp.getName());
        System.out.println("getSize: " + bStamp.getSize());
//        System.out.println("getTexts: " + bStamp.getTexts());
        System.out.println("getWidth: " + bStamp.getWidth());


        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();
    }
}
