package academy.pocu.comp2500.lab6;

public class NoHeavyMeal extends SetMenu{
    private static final int PRICE = 15;

    public NoHeavyMeal() {
        super(PRICE);
    }

    public boolean isValid() {
        return super.getCountAppetizer() == 2 && super.getCountDessert() > 0;
    }

    public void setAppetizers(Appetizer appetizer1, Appetizer appetizer2) {
        super.clearAppetizer();

        super.addAppetizer(appetizer1);
        super.addAppetizer(appetizer2);
    }

    public void setDessert(Dessert desert) {
        super.clearDessert();
        super.addDessert(desert);
    }
}