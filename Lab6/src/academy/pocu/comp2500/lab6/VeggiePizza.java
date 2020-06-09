package academy.pocu.comp2500.lab6;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        super(MenuPrice.VEGGIE_PIZZA);
    }

    public boolean addMozzarellaCheese() {
        return super.addTopping(Topping.MOZZARELLA_CHEESE);
    }

    public boolean removeMozzarellaCheese() {
        return super.removeTopping(Topping.MOZZARELLA_CHEESE);
    }

    public boolean addCheddarCheese() {
        return super.addTopping(Topping.CHEDDAR_CHEESE);
    }

    public boolean removeCheddarCheese() {
        return super.removeTopping(Topping.CHEDDAR_CHEESE);
    }

    public boolean addFetaCheese() {
        return super.addTopping(Topping.FETA_CHEESE);
    }

    public boolean removeFetaCheese() {
        return super.removeTopping(Topping.FETA_CHEESE);
    }
}