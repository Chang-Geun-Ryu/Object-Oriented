package academy.pocu.comp2500.lab6;

public class HousePizza extends Pizza {

    public HousePizza() {
        super(MenuPrice.HOUSE_PIZZA);
        super.toppings.add(Topping.BLACK_OLIVES);
        super.toppings.add(Topping.RED_ONIONS);
        super.toppings.add(Topping.GREEN_PEPPERS);
        super.toppings.add(Topping.MOZZARELLA_CHEESE);
    }

    public boolean addBacon() {
        if (isValid()) {
            return false;
        }

        super.toppings.add(Topping.BACON);
        ++this.meatCount;
        return true;
    }

    public boolean removeBacon() {
        boolean isRemoved = super.toppings.remove(Topping.BACON);

        if (isRemoved) {
            --this.meatCount;
        }

        return isRemoved;
    }

    public boolean addPeperoni() {
        if (isValid()) {
            return false;
        }

        super.toppings.add(Topping.PEPERONI);
        ++this.meatCount;
        return true;
    }

    public boolean removePeperoni() {
        boolean isRemoved = super.toppings.remove(Topping.PEPERONI);

        if (isRemoved) {
            --this.meatCount;
        }

        return isRemoved;
    }

    public boolean addSausages() {
        if (isValid()) {
            return false;
        }

        super.toppings.add(Topping.SAUSAGES);
        ++this.meatCount;
        return true;
    }

    public boolean removeSausages() {
        boolean isRemoved = super.toppings.remove(Topping.SAUSAGES);

        if (isRemoved) {
            --this.meatCount;
        }

        return isRemoved;
    }
}
