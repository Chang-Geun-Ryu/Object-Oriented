package academy.pocu.comp2500.lab6;

public class MeatLoverPizza extends Pizza {

    public MeatLoverPizza() {
        super(MenuPrice.MEAT_LOVER_PIZZA);
        super.addToppings(Topping.BACON);
        super.addToppings(Topping.PEPERONI);
        super.addToppings(Topping.HAM);
        super.addToppings(Topping.SAUSAGES);
        super.addToppings(Topping.CHEDDAR_CHEESE);
    }

    public boolean addBlackOlives() {
        if (isValid()) {
            return false;
        }

        super.addToppings(Topping.BLACK_OLIVES);
        this.isVeggieAdded = true;
        return true;
    }

    public boolean removeBlackOlives() {
        boolean isRemoved = super.removeToppings(Topping.BLACK_OLIVES);

        if (isRemoved) {
            this.isVeggieAdded = false;
        }

        return isRemoved;
    }

    public boolean addRedOnions() {
        if (isValid()) {
            return false;
        }

        super.addToppings(Topping.RED_ONIONS);
        this.isVeggieAdded = true;
        return true;
    }

    public boolean removeRedOnions() {
        boolean isRemoved = super.removeToppings(Topping.RED_ONIONS);

        if (isRemoved) {
            this.isVeggieAdded = false;
        }

        return isRemoved;
    }

    public boolean addGreenPeppers() {
        if (isValid()) {
            return false;
        }

        super.addToppings(Topping.GREEN_PEPPERS);
        this.isVeggieAdded = true;
        return true;
    }

    public boolean removeGreenPeppers() {
        boolean isRemoved = super.removeToppings(Topping.GREEN_PEPPERS);

        if (isRemoved) {
            this.isVeggieAdded = false;
        }

        return isRemoved;
    }
}