package academy.pocu.comp2500.lab6;

public class DeathByDesserts extends SetMenu {
    public DeathByDesserts() {
        super(MenuPrice.DEATH_BY_DESSERTS);
    }

    public void setDesserts(Dessert dessert1, Dessert dessert2, Dessert dessert3, Dessert dessert4) {
        this.desserts.clear();

        this.desserts.add(dessert1);
        this.desserts.add(dessert2);
        this.desserts.add(dessert3);
        this.desserts.add(dessert4);
        super.isValid = true;
    }
}