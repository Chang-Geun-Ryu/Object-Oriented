package academy.pocu.comp2500.lab6;

import java.util.ArrayList;
import java.util.Set;

public class SetMenu extends Manu {

    protected ArrayList<Appetizer> appetizers = new ArrayList<>();
    protected ArrayList<Dessert> desserts = new ArrayList<>();
//    protected ArrayList<MainCourse> mainCourses = new ArrayList<>();
    protected MainCourse mainCourse;
    protected Dessert dessert;
    protected Appetizer appetizer;

    private boolean isValid = false;

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

    public void setDesserts(Dessert dessert1, Dessert dessert2, Dessert dessert3, Dessert dessert4) {
        this.desserts.clear();

        this.desserts.add(dessert1);
        this.desserts.add(dessert2);
        this.desserts.add(dessert3);
        this.desserts.add(dessert4);
        this.isValid = true;
    }

    public void setAppetizers(Appetizer appetizer1, Appetizer appetizer2) {
        this.appetizers.clear();

        this.appetizers.add(appetizer1);
        this.appetizers.add(appetizer2);
    }

    public void setDessert(Dessert desert) {
        this.dessert = desert;
    }

    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setAppetizer(Appetizer appetizer) {
        this.appetizer = appetizer;
    }
}
