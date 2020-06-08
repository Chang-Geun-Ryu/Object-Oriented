package academy.pocu.comp2500.lab6;

import java.util.ArrayList;
import java.util.Set;

public class SetMenu extends Manu {

    protected ArrayList<Appetizer> appetizers = new ArrayList<>();
    protected ArrayList<Dessert> desserts = new ArrayList<>();
    protected ArrayList<MainCourse> mainCourses = new ArrayList<>();

    protected SetMenu(MenuPrice price) {
        super(price);
    }

    public boolean isValid() {
        switch (super.price) {
            case NO_HEAVY_MEAL:
                return getCountAppetizer() == 2 && getCountDessert() > 0;
            case DEATH_BY_DESSERTS:
                return getCountDessert() == 4;
            case THREE_COURSE_MEAL:
                return getCountAppetizer() > 0 && getCountMainCourse() > 0 && getCountDessert() > 0;
            default:
                assert (true) : "IT IS NOT SetMenu";
                return false;
        }
    }

    protected int getCountAppetizer() {
        return this.appetizers.size();
    }

    protected int getCountDessert() {
        return this.desserts.size();
    }

    protected int getCountMainCourse() {
        return this.mainCourses.size();
    }

    protected void addAppetizer(Appetizer appetizer) {
        this.appetizers.add(appetizer);
    }

    protected void addDessert(Dessert dessert) {
        this.desserts.add(dessert);
    }

    protected void addMainCourse(MainCourse mainCourse) {
        this.mainCourses.add(mainCourse);
    }

    protected void clearAppetizer() {
        this.appetizers.clear();
    }

    protected void clearDessert() {
        this.desserts.clear();
    }

    protected void clearMainCourse() {
        this.mainCourses.clear();
    }

//    public ArrayList<Appetizer> getAppetizer() {
//        assert getCountAppetizer() > 0 : "call isValid() first!";
//        return this.appetizers;
//    }

//    public ArrayList<MainCourse> getMainCourse() {
//        assert getCountMainCourse() > 0 : "call isValid() first!";
//        return this.mainCourses;
//    }

//    public ArrayList<Dessert> getDessert() {
//        assert getCountDessert() > 0 : "call isValid() first!";
//        return this.desserts;
//    }
}
