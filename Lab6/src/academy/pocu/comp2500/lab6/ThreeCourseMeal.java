package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class ThreeCourseMeal extends SetMenu {

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


}