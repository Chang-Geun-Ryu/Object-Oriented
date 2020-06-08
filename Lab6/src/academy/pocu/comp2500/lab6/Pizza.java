package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class Pizza extends Manu {

    protected static final int MAX_MEAT_COUNT = 2;
    protected static final int MAX_VEGGIE_COUNT = 2;
    protected static final int MAX_CHEESE_COUNT = 2;

    private ArrayList<Topping> toppings;

    protected int veggieCount;
    protected int meatCount;
    protected boolean isCheeseAdded;
    protected boolean isVeggieAdded;
    protected int cheeseCount;

    protected Pizza(MenuPrice price) {
        super(price);
        this.toppings = new ArrayList<>();
    }

    public boolean isValid() {
        switch (super.price) {
            case HOUSE_PIZZA:
                return this.meatCount == MAX_MEAT_COUNT;
            case VEGGIE_PIZZA:
                return this.cheeseCount == MAX_CHEESE_COUNT;
            case MEAT_LOVER_PIZZA:
                return this.isVeggieAdded;
            case FREE_SOUL_PIZZA:
                return this.meatCount == MAX_MEAT_COUNT
                        && this.veggieCount == MAX_VEGGIE_COUNT
                        && this.isCheeseAdded;
            default:
                assert (true) : "IT IS NOT Pizza";
                return false;
        }
    }

    public ArrayList<Topping> getToppings() {
        return this.toppings;
    }

    protected boolean addToppings(Topping topping) {
        return this.toppings.add(topping);
    }

    protected boolean removeToppings(Topping topping) {
        return this.toppings.remove(topping);
    }
}
