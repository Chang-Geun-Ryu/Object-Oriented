package academy.pocu.comp2500.lab6;

public class Manu {
    protected MenuPrice price;

    protected Manu(MenuPrice price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price.getPrice();
    }
}
