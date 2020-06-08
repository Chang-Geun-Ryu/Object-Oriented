package academy.pocu.comp2500.lab6;

import java.util.ArrayList;
import java.util.Set;

public class SetMenu {
    private int price;

    private ArrayList<Appetizer> appetizers = new ArrayList<>();
    private ArrayList<Dessert> desserts = new ArrayList<>();
    private ArrayList<MainCourse> mainCourses = new ArrayList<>();

    protected SetMenu(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
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

    public ArrayList<Appetizer> getAppetizer() {
        assert getCountAppetizer() > 0 : "call isValid() first!";
        return this.appetizers;
    }

    public ArrayList<MainCourse> getMainCourse() {
        assert getCountMainCourse() > 0 : "call isValid() first!";
        return this.mainCourses;
    }

    public ArrayList<Dessert> getDessert() {
        assert getCountDessert() > 0 : "call isValid() first!";
        return this.desserts;
    }
}
