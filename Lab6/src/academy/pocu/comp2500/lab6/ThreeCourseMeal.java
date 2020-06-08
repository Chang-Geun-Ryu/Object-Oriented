package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class ThreeCourseMeal extends SetMenu {
    private static final int PRICE = 25;

    public ThreeCourseMeal() {
        super(MenuPrice.THREE_COURSE_MEAL);
    }


    public void setMainCourse(MainCourse mainCourse) {
        super.clearMainCourse();
        super.addMainCourse(mainCourse);
    }

    public void setAppetizer(Appetizer appetizer) {
        super.clearAppetizer();
        super.addAppetizer(appetizer);
    }

    public void setDessert(Dessert dessert) {
        super.clearDessert();
        super.addDessert(dessert);
    }

    public Appetizer getAppetizer() {
        assert getCountAppetizer() > 0 : "call isValid() first!";
        return this.appetizers.get(0);
    }

    public MainCourse getMainCourse() {
        assert getCountMainCourse() > 0 : "call isValid() first!";
        return this.mainCourses.get(0);
    }

    public Dessert getDessert() {
        assert getCountDessert() > 0 : "call isValid() first!";
        return this.desserts.get(0);
    }
}