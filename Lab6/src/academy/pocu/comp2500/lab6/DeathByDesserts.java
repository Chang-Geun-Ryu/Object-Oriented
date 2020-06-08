package academy.pocu.comp2500.lab6;

public class DeathByDesserts extends SetMenu {
    private static final int PRICE = 20;

    public DeathByDesserts() {
        super(MenuPrice.DEATH_BY_DESSERTS);
    }

    public void setDesserts(Dessert dessert1, Dessert dessert2, Dessert dessert3, Dessert dessert4) {
        super.clearDessert();

        super.addDessert(dessert1);
        super.addDessert(dessert2);
        super.addDessert(dessert3);
        super.addDessert(dessert4);
    }
}