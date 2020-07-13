package academy.pocu.comp2500.lab9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

public class BuyOneGetOneFree implements IPriceable {
    private HashSet<UUID> sku;

    public BuyOneGetOneFree(HashSet<UUID> sku) {
        this.sku = sku;
    }

    public int getTotalPrice(ArrayList<Book> collections) {
        int sum = 0;

        HashMap<UUID, Boolean> hashMap = new HashMap<>();

        for (UUID u : this.sku) {
            hashMap.put(u, false);
        }

        for (Book book : collections) {
            if (sku.contains(book.getSku())) {
                if (hashMap.get(book.getSku())) { // 공짜!
                    hashMap.replace(book.getSku(), false);
                } else {
                    sum += book.getPrice();
                    hashMap.replace(book.getSku(), true);
                }
            } else {
                sum += book.getPrice();
            }
        }

        return sum;
    }
}
