package academy.pocu.comp2500.lab6;

public class ThreeCourseMeal extends SetMenu {
    private static final int PRICE = 25;

    public ThreeCourseMeal() {
        super(PRICE);
    }

    public boolean isValid() {
        return super.getCountAppetizer() > 0 && super.getCountMainCourse() > 0 && super.getCountDessert() > 0;
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