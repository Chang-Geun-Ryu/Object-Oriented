package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class Pizza {
    private int price;
    private ArrayList<Topping> toppings;

    protected int veggieCount;
    protected int meatCount;
    protected boolean isCheeseAdded;
    protected boolean isVeggieAdded;

    protected Pizza(int price) {
        this.price = price;
        this.toppings = new ArrayList<>();
    }

    public int getPrice() {
        return this.price;
    }

    public ArrayList<Topping> getToppings() {
        return this.toppings;
    }

    protected boolean addTopping(Topping topping) {
        return this.toppings.add(topping);
    }

    protected boolean removeTopping(Topping topping) {
        return this.toppings.remove(topping);
    }
}
