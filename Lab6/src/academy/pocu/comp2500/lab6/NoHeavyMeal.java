package academy.pocu.comp2500.lab6;

public class NoHeavyMeal extends SetMenu{
    private static final int PRICE = 15;

//    private ArrayList<Appetizer> appetizers = new ArrayList<>();
//    private Dessert dessert;

    public NoHeavyMeal() {
        super(PRICE);
    }

    public boolean isValid() {
        return super.getCountAppetizer() == 2 && super.getCountDessert() > 0;
    }

//    public ArrayList<Appetizer> getAppetizers() {
//        return this.appetizers;
//    }

//    public Dessert getDessert() {
//        assert (this.dessert != null) : "call isValid() first!";
//        return this.dessert;
//    }

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