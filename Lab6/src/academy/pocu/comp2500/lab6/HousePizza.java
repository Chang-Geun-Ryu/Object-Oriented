package academy.pocu.comp2500.lab6;

public class HousePizza extends Pizza {

    public HousePizza() {
        super(MenuPrice.HOUSE_PIZZA);
    }

    public boolean addBacon() {
        return super.add(Topping.BACON);
    }

    public boolean removeBacon() {
        return super.remove(Topping.BACON);
    }

    public boolean addPeperoni() {
        return super.add(Topping.PEPERONI);
    }

    public boolean removePeperoni() {
        return super.remove(Topping.PEPERONI);
    }

    public boolean addSausages() {
        return super.add(Topping.SAUSAGES);
    }

    public boolean removeSausages() {
        return super.remove(Topping.SAUSAGES);
    }
}
