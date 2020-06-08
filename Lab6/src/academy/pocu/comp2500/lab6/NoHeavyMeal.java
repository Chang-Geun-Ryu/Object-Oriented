package academy.pocu.comp2500.lab6;

import java.util.ArrayList;
import java.util.Set;

//public class NoHeavyMeal extends SetMenu{
//
//    public NoHeavyMeal() {
//        super(MenuPrice.NO_HEAVY_MEAL);
//    }
//
//    public void setAppetizers(Appetizer appetizer1, Appetizer appetizer2) {
//        super.clearAppetizer();
//
//        super.addAppetizer(appetizer1);
//        super.addAppetizer(appetizer2);
//    }
//
//    public void setDessert(Dessert desert) {
//        super.clearDessert();
//        super.addDessert(desert);
//    }
//}

public class NoHeavyMeal extends SetMenu {
    private ArrayList<Appetizer> appetizers = new ArrayList<>();
    private Dessert dessert;

    protected NoHeavyMeal() {
        super(MenuPrice.NO_HEAVY_MEAL);
    }

//    public boolean isValid() {
//        return this.appetizers.size() == 2 && this.dessert != null;
//    }

    public ArrayList<Appetizer> getAppetizers() {
        return this.appetizers;
    }

    public Dessert getDessert() {
        assert (this.dessert != null) : "call isValid() first!";
        return this.dessert;
    }


}