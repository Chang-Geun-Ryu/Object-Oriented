package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class NoHeavyMeal extends SetMenu{

    public NoHeavyMeal() {
        super(MenuPrice.NO_HEAVY_MEAL);
    }

    public void setAppetizers(Appetizer appetizer1, Appetizer appetizer2) {
        super.clearAppetizer();

        super.addAppetizer(appetizer1);
        super.addAppetizer(appetizer2);
    }

    public void setDessert(Dessert desert) {
        super.clearDessert();
        super.addDessert(desert);
    }

    public ArrayList<Appetizer> getAppetizers() {
        return this.appetizers;
    }

    public Dessert getDessert() {
        assert (super.desserts.size() > 0) : "call isValid() first!";
        return super.desserts.get(0);
    }
}