package academy.pocu.comp2500.lab6;

import java.util.ArrayList;
import java.util.Collections;

public class SetMenu extends Manu {
    protected SetMenu(MenuPrice price) {
        super(price);
    }

    public ArrayList<MainCourse> getMainCourses() {
        if (super.price != MenuPrice.THREE_COURSE_MEAL) {
            return new ArrayList<MainCourse>();
        } else {
            assert (this.mainCourse != null) : "call isValid() first!";
            return new ArrayList<MainCourse>(Collections.singleton(this.mainCourse));
        }
    }

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
