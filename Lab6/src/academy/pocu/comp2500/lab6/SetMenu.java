package academy.pocu.comp2500.lab6;

import java.util.ArrayList;
import java.util.Collections;

public class SetMenu extends Manu {
    protected SetMenu(MenuPrice price) {
        super(price);
    }

    public ArrayList<MainCourse> getMainCourses() {
        if (super.price == MenuPrice.DEATH_BY_DESSERTS) {
            assert (this.mainCourse != null) : "call isValid() first!";
            return new ArrayList<MainCourse>();
        } else if (super.price == MenuPrice.NO_HEAVY_MEAL) {
            assert (this.mainCourse != null) : "call isValid() first!";
            return new ArrayList<MainCourse>();
        } else if (super.price == MenuPrice.THREE_COURSE_MEAL){
            assert (this.mainCourse != null) : "call isValid() first!";
            return new ArrayList<MainCourse>(Collections.singleton(this.mainCourse));
        } else {
            return new ArrayList<MainCourse>();
        }
    }

    public ArrayList<Dessert> getDesserts() {
        if (super.price == MenuPrice.DEATH_BY_DESSERTS) {
            return this.desserts;
        } else if (super.price == MenuPrice.NO_HEAVY_MEAL) {
            assert (this.dessert != null) : "call isValid() first!";
            return new ArrayList<Dessert>(Collections.singleton(this.dessert));
        } else if (super.price == MenuPrice.THREE_COURSE_MEAL){
            assert (this.dessert != null) : "call isValid() first!";
            return new ArrayList<Dessert>(Collections.singleton(this.dessert));
        } else {
            return new ArrayList<Dessert>();
        }
    }

    public ArrayList<Appetizer> getAppetizers() {
        if (super.price == MenuPrice.DEATH_BY_DESSERTS) {
            return new ArrayList<Appetizer>();
        } else if (super.price == MenuPrice.NO_HEAVY_MEAL) {
            assert (this.dessert != null) : "call isValid() first!";
            return this.appetizers;
        } else if (super.price == MenuPrice.THREE_COURSE_MEAL){
            assert (this.dessert != null) : "call isValid() first!";
            return new ArrayList<Appetizer>(Collections.singleton(this.appetizer));
        } else {
            return new ArrayList<Appetizer>();
        }
    }
}
