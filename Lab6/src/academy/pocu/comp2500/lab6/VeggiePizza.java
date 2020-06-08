package academy.pocu.comp2500.lab6;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        super(MenuPrice.VEGGIE_PIZZA);
        super.toppings.add(Topping.BLACK_OLIVES);
        super.toppings.add(Topping.RED_ONIONS);
        super.toppings.add(Topping.GREEN_PEPPERS);
    }

    public boolean addMozzarellaCheese() {
        return super.add(Topping.MOZZARELLA_CHEESE);
    }

    public boolean removeMozzarellaCheese() {
        return super.remove(Topping.MOZZARELLA_CHEESE);
    }

    public boolean addCheddarCheese() {
        return super.add(Topping.CHEDDAR_CHEESE);
    }

    public boolean removeCheddarCheese() {
        return super.remove(Topping.CHEDDAR_CHEESE);
    }

    public boolean addFetaCheese() {
        return super.add(Topping.FETA_CHEESE);
    }

    public boolean removeFetaCheese() {
        return super.remove(Topping.FETA_CHEESE);
    }
}