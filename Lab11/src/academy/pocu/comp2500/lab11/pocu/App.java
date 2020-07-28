package academy.pocu.comp2500.lab11.pocu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;

public class App {

    public void run(BufferedReader in, PrintStream out, PrintStream err) {

        Warehouse warehouse = phaseOne(in, out, err);

        if (warehouse == null) {
            return;
        }

        SafeWallet wallet = phaseTwo(err);

        if (wallet == null) {
            return;
        }

        phaseThree(warehouse, wallet, in, out, err);


    }

    private Warehouse phaseOne(BufferedReader in, PrintStream out, PrintStream err) {
        HashMap<Integer, WarehouseType> types = new HashMap<>();
        int index = 0;
        for (WarehouseType type : WarehouseType.values()) {
            types.put(++index, type);
        }

        Warehouse warehouse = null;

        do {
            int warehouseNum = getWarehouse(in, out, err);
            if (warehouseNum == -1) {
                return null;
            }

            if (types.containsKey(warehouseNum)) {
                warehouse = new Warehouse(types.get(warehouseNum));
            }
        } while (warehouse == null);

        return warehouse;
    }

    private SafeWallet phaseTwo(PrintStream err) {
        User user = new User();
        return getWalletOrNull(user, err);
    }

    private void phaseThree(Warehouse warehouse, SafeWallet wallet, BufferedReader in, PrintStream out, PrintStream err) {

        do {
            getProduct(warehouse, wallet, in, out, err);
        } while (warehouse.getProducts().size() > 0);
    }

    private int getWarehouse(BufferedReader in, PrintStream out, PrintStream err) {

        out.println("WAREHOUSE: Choose your warehouse!");
        int index = 0;
        for (WarehouseType type : WarehouseType.values()) {
            out.println(String.format("%d %s", ++index, type));
        }

        int num = 0;
        try {
            String s = in.readLine();

            if (s == null) {
                return 0;
            }

            if (s.length() == 4 && s.equals("exit")) {  // exit
                return num = -1;
            }

            num = Integer.parseInt(s);
        } catch (RuntimeException e) {
            out.println(e.getMessage());
            return 0;
        } catch (Exception e) {
            return 0;
        }

        return num;
    }

    private SafeWallet getWalletOrNull(User user, PrintStream err) {

        try {
            SafeWallet wallet = new SafeWallet(user);

            return wallet;
        } catch (IllegalArgumentException e) {
            err.println("AUTH_ERROR");
        } catch (PermanentlyClosedException e) {
            err.println("AUTH_ERROR");
        } catch (Exception e) {
            err.println("AUTH_ERROR");
        }


        return null;
    }

    private int getProduct(Warehouse warehouse, SafeWallet wallet, BufferedReader in, PrintStream out, PrintStream err) {
        out.println(String.format("BALANCE: %d", wallet.getAmount()));
        out.println("PRODUCT_LIST: Choose the product you want to buy!");
        HashMap<Integer, Product> products = new HashMap<>();
        int index = 0;
        for (Product p : warehouse.getProducts()) {
            out.println(String.format("%d. %s          %d", ++index, p.getName(), p.getPrice()));
            products.put(index, p);
        }

        int num = 0;
        try {
            String s = in.readLine();

            if (s == null) {
                return 0;
            }

            if (s.length() == 4 && s.equals("exit")) {  // exit
                return -1;
            }

            num = Integer.parseInt(s);
            if (products.get(num).getPrice() <= wallet.getAmount()) {
                warehouse.removeProduct(products.get(num).getId());
                wallet.withdraw(products.get(num).getPrice());
            }

        } catch (RuntimeException e) {
            out.println(e.getMessage());
        } catch (Exception e) {
            return 0;
        }

        return 0;
    }
}
