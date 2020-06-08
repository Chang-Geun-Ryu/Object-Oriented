package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class HousePizza extends Pizza {
    private static final int PRICE = 20;
    private static final int MAX_MEAT_COUNT = 2;

    private int price = PRICE;
    private ArrayList<Topping> toppings = new ArrayList<>();

    private int meatCount;

    public HousePizza() {
        super(PRICE);
        super.addTopping(Topping.BLACK_OLIVES);
        super.addTopping(Topping.RED_ONIONS);
        super.addTopping(Topping.GREEN_PEPPERS);
        super.addTopping(Topping.MOZZARELLA_CHEESE);
    }

    public boolean isValid() {
        return this.meatCount == MAX_MEAT_COUNT;
    }

    public boolean addBacon() {
        if (isValid()) {
            return false;
        }

        super.addTopping(Topping.BACON);
        ++this.meatCount;
        return true;
    }

    public boolean removeBacon() {
        boolean isRemoved = super.removeTopping(Topping.BACON);

        if (isRemoved) {
            --this.meatCount;
        }

        return isRemoved;
    }

    public boolean addPeperoni() {
        if (isValid()) {
            return false;
        }

        super.addTopping(Topping.PEPERONI);
        ++this.meatCount;
        return true;
    }

    public boolean removePeperoni() {
        boolean isRemoved = super.removeTopping(Topping.PEPERONI);

        if (isRemoved) {
            --this.meatCount;
        }

        return isRemoved;
    }

    public boolean addSausages() {
        if (isValid()) {
            return false;
        }

        super.addTopping(Topping.SAUSAGES);
        ++this.meatCount;
        return true;
    }

    public boolean removeSausages() {
        boolean isRemoved = super.removeTopping(Topping.SAUSAGES);

        if (isRemoved) {
            --this.meatCount;
        }

        return isRemoved;
    }
}
