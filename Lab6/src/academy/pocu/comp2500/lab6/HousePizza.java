package academy.pocu.comp2500.lab6;

public class HousePizza extends Pizza {

    public HousePizza() {
        super(MenuPrice.HOUSE_PIZZA);
        super.addTopping(Topping.BLACK_OLIVES);
        super.addTopping(Topping.RED_ONIONS);
        super.addTopping(Topping.GREEN_PEPPERS);
        super.addTopping(Topping.MOZZARELLA_CHEESE);
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
