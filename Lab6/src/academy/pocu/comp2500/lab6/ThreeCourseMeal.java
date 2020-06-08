package academy.pocu.comp2500.lab6;

import java.util.Set;

public class ThreeCourseMeal extends SetMenu {
    private static final int PRICE = 25;

//    private int price = PRICE;
//
//    private Appetizer appetizer;
//    private MainCourse mainCourse;
//    private Dessert dessert;

    public ThreeCourseMeal() {
        super(PRICE);
    }

    public boolean isValid() {
        return super.getCountAppetizer() > 0 && super.getCountMainCourse() > 0 && super.getCountDessert() > 0;
    }

//    public Appetizer getAppetizer() {
//        assert (this.appetizer != null) : "call isValid() first!";
//        return this.appetizer;
//    }
//
//    public MainCourse getMainCourse() {
//        assert (this.mainCourse != null) : "call isValid() first!";
//        return this.mainCourse;
//    }
//
//    public Dessert getDessert() {
//        assert (this.dessert != null) : "call isValid() first!";
//        return this.dessert;
//    }

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