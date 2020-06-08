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

///////////////////////

    public boolean addTopping(Topping topping) {
        if ((isMeat(topping) && this.meatCount >= MAX_MEAT_COUNT)
                || (isVeggie(topping) && this.veggieCount >= MAX_VEGGIE_COUNT)
                || (isCheese(topping) && this.isCheeseAdded)) {
            return false;
        }

        this.toppings.add(topping);

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
        boolean isRemoved = this.toppings.remove(topping);

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

/////////////////////////
    public boolean addBlackOlives() {
        if (isValid()) {
            return false;
        }

        this.toppings.add(Topping.BLACK_OLIVES);
        this.isVeggieAdded = true;
        return true;
    }

    public boolean removeBlackOlives() {
        boolean isRemoved = this.toppings.remove(Topping.BLACK_OLIVES);

        if (isRemoved) {
            this.isVeggieAdded = false;
        }

        return isRemoved;
    }

    public boolean addRedOnions() {
        if (isValid()) {
            return false;
        }

        this.toppings.add(Topping.RED_ONIONS);
        this.isVeggieAdded = true;
        return true;
    }

    public boolean removeRedOnions() {
        boolean isRemoved = this.toppings.remove(Topping.RED_ONIONS);

        if (isRemoved) {
            this.isVeggieAdded = false;
        }

        return isRemoved;
    }

    public boolean addGreenPeppers() {
        if (isValid()) {
            return false;
        }

        this.toppings.add(Topping.GREEN_PEPPERS);
        this.isVeggieAdded = true;
        return true;
    }

    public boolean removeGreenPeppers() {
        boolean isRemoved = this.toppings.remove(Topping.GREEN_PEPPERS);

        if (isRemoved) {
            this.isVeggieAdded = false;
        }

        return isRemoved;
    }

    ////////////////////////
    public boolean addBacon() {
        if (isValid()) {
            return false;
        }

        this.toppings.add(Topping.BACON);
        ++this.meatCount;
        return true;
    }

    public boolean removeBacon() {
        boolean isRemoved = this.toppings.remove(Topping.BACON);

        if (isRemoved) {
            --this.meatCount;
        }

        return isRemoved;
    }

    public boolean addPeperoni() {
        if (isValid()) {
            return false;
        }

        this.toppings.add(Topping.PEPERONI);
        ++this.meatCount;
        return true;
    }

    public boolean removePeperoni() {
        boolean isRemoved = this.toppings.remove(Topping.PEPERONI);

        if (isRemoved) {
            --this.meatCount;
        }

        return isRemoved;
    }

    public boolean addSausages() {
        if (isValid()) {
            return false;
        }

        this.toppings.add(Topping.SAUSAGES);
        ++this.meatCount;
        return true;
    }

    public boolean removeSausages() {
        boolean isRemoved = this.toppings.remove(Topping.SAUSAGES);

        if (isRemoved) {
            --this.meatCount;
        }

        return isRemoved;
    }

    public boolean addMozzarellaCheese() {
        if (isValid()) {
            return false;
        }

        this.toppings.add(Topping.MOZZARELLA_CHEESE);
        ++this.cheeseCount;
        return true;
    }

    public boolean removeMozzarellaCheese() {
        boolean isRemoved = this.toppings.remove(Topping.MOZZARELLA_CHEESE);

        if (isRemoved) {
            --this.cheeseCount;
        }

        return isRemoved;
    }

    public boolean addCheddarCheese() {
        if (isValid()) {
            return false;
        }

        this.toppings.add(Topping.CHEDDAR_CHEESE);
        ++this.cheeseCount;
        return true;
    }

    public boolean removeCheddarCheese() {
        boolean isRemoved = this.toppings.remove(Topping.CHEDDAR_CHEESE);

        if (isRemoved) {
            --this.cheeseCount;
        }

        return isRemoved;
    }

    public boolean addFetaCheese() {
        if (isValid()) {
            return false;
        }

        this.toppings.add(Topping.FETA_CHEESE);
        ++this.cheeseCount;
        return true;
    }

    public boolean removeFetaCheese() {
        boolean isRemoved = this.toppings.remove(Topping.FETA_CHEESE);

        if (isRemoved) {
            --this.cheeseCount;
        }

        return isRemoved;
    }
}
