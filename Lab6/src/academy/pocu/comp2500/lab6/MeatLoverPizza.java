package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class MeatLoverPizza extends Pizza {
    private static final int PRICE = 21;
    private boolean isVeggieAdded;

    public MeatLoverPizza() {
        super(PRICE);
        super.addTopping(Topping.BACON);
        super.addTopping(Topping.PEPERONI);
        super.addTopping(Topping.HAM);
        super.addTopping(Topping.SAUSAGES);
        super.addTopping(Topping.CHEDDAR_CHEESE);
    }

    public boolean isValid() {
        return this.isVeggieAdded;
    }

    public boolean addBlackOlives() {
        if (isValid()) {
            return false;
        }

        super.addTopping(Topping.BLACK_OLIVES);
        this.isVeggieAdded = true;
        return true;
    }

    public boolean removeBlackOlives() {
        boolean isRemoved = super.removeTopping(Topping.BLACK_OLIVES);

        if (isRemoved) {
            this.isVeggieAdded = false;
        }

        return isRemoved;
    }

    public boolean addRedOnions() {
        if (isValid()) {
            return false;
        }

        super.addTopping(Topping.RED_ONIONS);
        this.isVeggieAdded = true;
        return true;
    }

    public boolean removeRedOnions() {
        boolean isRemoved = super.removeTopping(Topping.RED_ONIONS);

        if (isRemoved) {
            this.isVeggieAdded = false;
        }

        return isRemoved;
    }

    public boolean addGreenPeppers() {
        if (isValid()) {
            return false;
        }

        super.addTopping(Topping.GREEN_PEPPERS);
        this.isVeggieAdded = true;
        return true;
    }

    public boolean removeGreenPeppers() {
        boolean isRemoved = super.removeTopping(Topping.GREEN_PEPPERS);

        if (isRemoved) {
            this.isVeggieAdded = false;
        }

        return isRemoved;
    }
}