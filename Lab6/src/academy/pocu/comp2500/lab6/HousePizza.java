package academy.pocu.comp2500.lab6;

public class HousePizza extends Pizza {

    public HousePizza() {
        super(MenuPrice.HOUSE_PIZZA);
    }

    public boolean addBacon() {
        return super.addTopping(Topping.BACON);
    }

    public boolean removeBacon() {
        return super.removeTopping(Topping.BACON);
    }

    public boolean addPeperoni() {
        return super.addTopping(Topping.PEPERONI);
    }

    public boolean removePeperoni() {
        return super.removeTopping(Topping.PEPERONI);
    }

    public boolean addSausages() {
        return super.addTopping(Topping.SAUSAGES);
    }

    public boolean removeSausages() {
        return super.removeTopping(Topping.SAUSAGES);
    }
}
