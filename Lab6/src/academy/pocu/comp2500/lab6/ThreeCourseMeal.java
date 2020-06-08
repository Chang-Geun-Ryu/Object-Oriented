package academy.pocu.comp2500.lab6;

import java.util.ArrayList;
import java.util.Set;

//public class ThreeCourseMeal extends SetMenu {
//
//    public ThreeCourseMeal() {
//        super(MenuPrice.THREE_COURSE_MEAL);
//    }
//    public void setMainCourse(MainCourse mainCourse) {
//        super.clearMainCourse();
//        super.addMainCourse(mainCourse);
//    }
//
//    public void setAppetizer(Appetizer appetizer) {
//        super.clearAppetizer();
//        super.addAppetizer(appetizer);
//    }
//
//    public void setDessert(Dessert dessert) {
//        super.clearDessert();
//        super.addDessert(dessert);
//    }
//}
public class ThreeCourseMeal extends SetMenu {
    public ThreeCourseMeal() {
        super(MenuPrice.THREE_COURSE_MEAL);
    }

    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setAppetizer(Appetizer appetizer) {
        this.appetizer = appetizer;
    }

    public void setDessert(Dessert desert) {
        this.dessert = desert;
    }
}