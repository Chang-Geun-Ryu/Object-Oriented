package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class FreeSoulPizza extends Pizza {
//    private static final int PRICE = 25;
//    private static final int MAX_MEAT_COUNT = 2;
//    private static final int MAX_VEGGIE_COUNT = 2;

    public FreeSoulPizza() {
        super(MenuPrice.FREE_SOUL_PIZZA);

        this.veggieCount = 0;
        this.meatCount = 0;
        this.isCheeseAdded = false;
    }

//    public boolean isValid() {
//        return this.meatCount == MAX_MEAT_COUNT
//                && this.veggieCount == MAX_VEGGIE_COUNT
//                && this.isCheeseAdded;
//    }

    public boolean addTopping(Topping topping) {
        if ((isMeat(topping) && this.meatCount >= MAX_MEAT_COUNT)
                || (isVeggie(topping) && this.veggieCount >= MAX_VEGGIE_COUNT)
                || (isCheese(topping) && this.isCheeseAdded)) {
            return false;
        }

        super.addToppings(topping);

        if (isMeat(topping)) {
            ++this.meatCount;
        }

        if (isVeggie(topping)) {
            ++this.veggieCount;
        }

        if (isCheese(topping)) {
            this.isCheeseAdded = true;
        }

        return true;
    }

    public boolean removeTopping(Topping topping) {
        boolean isRemoved = super.removeToppings(topping);

        if (isRemoved) {
            if (isMeat(topping)) {
                --this.meatCount;
            }

            if (isVeggie(topping)) {
                --this.veggieCount;
            }

            if (isCheese(topping)) {
                this.isCheeseAdded = false;
            }
        }

        return isRemoved;
    }

    private static boolean isMeat(Topping topping) {
        return topping == Topping.BACON
                || topping == Topping.CHICKEN
                || topping == Topping.PEPERONI
                || topping == Topping.SAUSAGES
                || topping == Topping.HAM;
    }

    private static boolean isVeggie(Topping topping) {
        return topping == Topping.BLACK_OLIVES
                || topping == Topping.RED_ONIONS
                || topping == Topping.GREEN_PEPPERS;
    }

    private static boolean isCheese(Topping topping) {
        return topping == Topping.MOZZARELLA_CHEESE
                || topping == Topping.CHEDDAR_CHEESE
                || topping == Topping.FETA_CHEESE;
    }
}