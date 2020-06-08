package academy.pocu.comp2500.lab6;

public class VeggiePizza extends Pizza {
    private static final int PRICE = 17;
    private static final int MAX_CHEESE_COUNT = 2;

    public VeggiePizza() {
        super(PRICE);
        super.addTopping(Topping.BLACK_OLIVES);
        super.addTopping(Topping.RED_ONIONS);
        super.addTopping(Topping.GREEN_PEPPERS);
    }
    public boolean isValid() {
        return this.cheeseCount == MAX_CHEESE_COUNT;
    }

    public boolean addMozzarellaCheese() {
        if (isValid()) {
            return false;
        }

        super.addTopping(Topping.MOZZARELLA_CHEESE);
        ++this.cheeseCount;
        return true;
    }

    public boolean removeMozzarellaCheese() {
        boolean isRemoved = super.removeTopping(Topping.MOZZARELLA_CHEESE);

        if (isRemoved) {
            --this.cheeseCount;
        }

        return isRemoved;
    }

    public boolean addCheddarCheese() {
        if (isValid()) {
            return false;
        }

        super.addTopping(Topping.CHEDDAR_CHEESE);
        ++this.cheeseCount;
        return true;
    }

    public boolean removeCheddarCheese() {
        boolean isRemoved = super.removeTopping(Topping.CHEDDAR_CHEESE);

        if (isRemoved) {
            --this.cheeseCount;
        }

        return isRemoved;
    }

    public boolean addFetaCheese() {
        if (isValid()) {
            return false;
        }

        super.addTopping(Topping.FETA_CHEESE);
        ++this.cheeseCount;
        return true;
    }

    public boolean removeFetaCheese() {
        boolean isRemoved = super.removeTopping(Topping.FETA_CHEESE);

        if (isRemoved) {
            --this.cheeseCount;
        }

        return isRemoved;
    }
}