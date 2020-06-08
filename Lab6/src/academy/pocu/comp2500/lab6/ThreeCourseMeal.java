package academy.pocu.comp2500.lab6;

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
}