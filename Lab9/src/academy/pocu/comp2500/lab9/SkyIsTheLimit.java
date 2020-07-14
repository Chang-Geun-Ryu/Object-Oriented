package academy.pocu.comp2500.lab9;

import java.util.ArrayList;
import java.util.Collections;

public class SkyIsTheLimit implements IPriceable {
    private int price;

    public SkyIsTheLimit(int price) {
        this.price = price;
    }

    @Override
    public int getTotalPrice(ArrayList<Book> collections) {
        if (collections == null || collections.size() == 0) {
            return 0;
        }

        double sum = 0;

        for (Book book : collections) {
            sum += book.getPrice();
        }

//        System.out.println(collections);
        Collections.sort(collections, (lhs, rhs) -> {
            return Integer.compare(rhs.getPrice(), lhs.getPrice());
        });

//        System.out.println(collections);

        if (sum >= price) {
//            for (int i = 0; i < 2; ++i) {
            int index = 0;
            for (Book b : collections) {
                if (++index <= 2) {
                    sum -= (double) b.getPrice();
                    sum += (double) b.getPrice() / 2d;
                }
            }
        }

        return (int) sum;
    }
}
