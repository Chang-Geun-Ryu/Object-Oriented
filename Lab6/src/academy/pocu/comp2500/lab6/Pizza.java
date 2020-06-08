package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class Pizza extends Manu {

    protected static final int MAX_MEAT_COUNT = 2;
    protected static final int MAX_VEGGIE_COUNT = 2;
    protected static final int MAX_CHEESE_COUNT = 2;

    protected ArrayList<Topping> toppings;

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
//    public boolean addTopping(Topping topping) {
//
//        switch (super.price) {
//            case HOUSE_PIZZA:
//            case VEGGIE_PIZZA:
//            case MEAT_LOVER_PIZZA:
//                return this.toppings.add(topping);
//            case FREE_SOUL_PIZZA:
//                return addMeatLover(topping);
//            default:
//                assert (true) : "IT IS NOT Pizza";
//                return false;
//        }
//    }
//
//    public boolean removeTopping(Topping topping) {
//        switch (super.price) {
//            case HOUSE_PIZZA:
//            case VEGGIE_PIZZA:
//            case MEAT_LOVER_PIZZA:
//                return this.toppings.remove(topping);
//            case FREE_SOUL_PIZZA:
//                return removeMeatLover(topping);
//            default:
//                assert (true) : "IT IS NOT Pizza";
//                return false;
//        }
//    }

//    protected boolean addTopping(Topping topping) {
//        return this.toppings.add(topping);
//    }
//
//    protected boolean removeTopping(Topping topping) {
//        return this.toppings.remove(topping);
//    }

    protected static boolean isMeat(Topping topping) {
        return topping == Topping.BACON
                || topping == Topping.CHICKEN
                || topping == Topping.PEPERONI
                || topping == Topping.SAUSAGES
                || topping == Topping.HAM;
    }

    protected static boolean isVeggie(Topping topping) {
        return topping == Topping.BLACK_OLIVES
                || topping == Topping.RED_ONIONS
                || topping == Topping.GREEN_PEPPERS;
    }

    protected static boolean isCheese(Topping topping) {
        return topping == Topping.MOZZARELLA_CHEESE
                || topping == Topping.CHEDDAR_CHEESE
                || topping == Topping.FETA_CHEESE;
    }
}
