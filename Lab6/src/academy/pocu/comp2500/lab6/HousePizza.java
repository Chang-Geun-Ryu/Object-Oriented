package academy.pocu.comp2500.lab6;

public class HousePizza extends Pizza {

    public HousePizza() {
        super(MenuPrice.HOUSE_PIZZA);
        super.addToppings(Topping.BLACK_OLIVES);
        super.addToppings(Topping.RED_ONIONS);
        super.addToppings(Topping.GREEN_PEPPERS);
        super.addToppings(Topping.MOZZARELLA_CHEESE);
    }

    public boolean addBacon() {
        if (isValid()) {
            return false;
        }

        super.addToppings(Topping.BACON);
        ++this.meatCount;
        return true;
    }

    public boolean removeBacon() {
        boolean isRemoved = super.removeToppings(Topping.BACON);

        if (isRemoved) {
            --this.meatCount;
        }

        return isRemoved;
    }

    public boolean addPeperoni() {
        if (isValid()) {
            return false;
        }

        super.addToppings(Topping.PEPERONI);
        ++this.meatCount;
        return true;
    }

    public boolean removePeperoni() {
        boolean isRemoved = super.removeToppings(Topping.PEPERONI);

        if (isRemoved) {
            --this.meatCount;
        }

        return isRemoved;
    }

    public boolean addSausages() {
        if (isValid()) {
            return false;
        }

        super.addToppings(Topping.SAUSAGES);
        ++this.meatCount;
        return true;
    }

    public boolean removeSausages() {
        boolean isRemoved = super.removeToppings(Topping.SAUSAGES);

        if (isRemoved) {
            --this.meatCount;
        }

        return isRemoved;
    }
}
