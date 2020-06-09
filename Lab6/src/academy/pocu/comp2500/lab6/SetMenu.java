package academy.pocu.comp2500.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class SetMenu extends Manu {

    protected ArrayList<Appetizer> appetizers = new ArrayList<>();
    protected ArrayList<Dessert> desserts = new ArrayList<>();
    protected MainCourse mainCourse;
    protected Dessert dessert;
    protected Appetizer appetizer;

    protected boolean isValid = false;

    protected SetMenu(MenuPrice price) {
        super(price);
    }

    public boolean isValid() {
        switch (super.price) {
            case NO_HEAVY_MEAL:
                return this.appetizers.size() == 2 && this.dessert != null;
            case DEATH_BY_DESSERTS:
                return this.isValid;
            case THREE_COURSE_MEAL:
                return this.mainCourse != null && this.dessert != null && this.appetizer != null;
            default:
                assert (true) : "IT IS NOT SetMenu";
                return false;
        }
    }

//    public Appetizer getAppetizer() {
//        assert (this.appetizer != null) : "call isValid() first!";
//        return this.appetizer;
//    }

    public MainCourse getMainCourse() {
        assert (this.mainCourse != null) : "call isValid() first!";
        return this.mainCourse;
    }

//    public Dessert getDessert() {
//        assert (this.dessert != null) : "call isValid() first!";
//        return this.dessert;
//    }

    public ArrayList<Dessert> getDesserts() {
        if (super.price == MenuPrice.DEATH_BY_DESSERTS) {
            return this.desserts;
        } else {
            assert (this.dessert != null) : "call isValid() first!";
            return new ArrayList<Dessert>(Collections.singleton(this.dessert));
        }
    }

    public ArrayList<Appetizer> getAppetizers() {
        if (super.price == MenuPrice.NO_HEAVY_MEAL) {
            return this.appetizers;
        } else {
            return new ArrayList<Appetizer>(Collections.singleton(this.appetizer));
        }
    }
}
