package academy.pocu.comp2500.lab11;



import academy.pocu.comp2500.lab11.pocu.Product;
import academy.pocu.comp2500.lab11.pocu.Wallet;
import academy.pocu.comp2500.lab11.pocu.User;
import academy.pocu.comp2500.lab11.pocu.Warehouse;
import academy.pocu.comp2500.lab11.pocu.WarehouseType;
import academy.pocu.comp2500.lab11.pocu.Department;
import academy.pocu.comp2500.lab11.pocu.PermanentlyClosedException;
import academy.pocu.comp2500.lab11.pocu.ProductNotFoundException;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.HashMap;

public class App {

    public void run(BufferedReader in, PrintStream out, PrintStream err) {
        Warehouse warehouse = phaseOne(in, out, err);

        if ()
    }

    public void runfail(BufferedReader in, PrintStream out, PrintStream err) {

        try {
            Warehouse warehouse = phaseOne(in, out, err);

            if (warehouse == null) {
                return;
            }

            SafeWallet wallet = phaseTwo(err);

            if (wallet == null) {
                return;
            }

            phaseThree(warehouse, wallet, in, out, err);
        } catch (OverflowException e) {
            throw e;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private Warehouse phaseOne(BufferedReader in, PrintStream out, PrintStream err) {


        Warehouse warehouse = null;

        do {
            HashMap<Integer, WarehouseType> types = new HashMap<>();
            int index = 0;
            for (WarehouseType type : WarehouseType.values()) {
                types.put(++index, type);
            }

            int warehouseNum = getWarehouse(in, out, err);
            if (warehouseNum == -1) {
                return null;
            }

            try {
                if (types.containsKey(warehouseNum)) {
                    warehouse = new Warehouse(types.get(warehouseNum));
                }
            } catch (RuntimeException e) {
                err.println(e.getMessage());
                warehouse = null;
            }
        } while (warehouse == null);

        return warehouse;
    }

    private SafeWallet phaseTwo(PrintStream err) {
        try {
            User user = new User();
            return getWalletOrNull(user, err);
        } catch (OverflowException e) {
//            err.println(e.getMessage());
            throw e;
        } catch (RuntimeException e) {
            err.println(e.getMessage());
            return null;
        }
    }

    private void phaseThree(Warehouse warehouse, SafeWallet wallet, BufferedReader in, PrintStream out, PrintStream err) {

        do {
            try {
                if (getProduct(warehouse, wallet, in, out, err) == -1) {
                    return;
                }
            } catch (OverflowException e) {
//            err.println(e.getMessage());
                throw e;
            } catch (RuntimeException e) {
                continue;
            }
        } while (warehouse.getProducts().size() > 0);
    }

    private int getWarehouse(BufferedReader in, PrintStream out, PrintStream err) {

        out.println("WAREHOUSE: Choose your warehouse!");
        int index = 0;
        for (WarehouseType type : WarehouseType.values()) {
//            out.println(String.format("%d. %s", ++index, type));
            out.printf("%d. %s%s", ++index, type, System.lineSeparator());
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

            if (WarehouseType.values().length >= 0) {
                if (num >= 1 && num <= WarehouseType.values().length) {
                    return num;
                } else {
                    return 0;
                }
            } else {
                return -1;
            }
        } catch (RuntimeException e) {
            out.println(e.getMessage());
            return 0;
        } catch (Exception e) {
            return 0;
        }

//        return num;
    }

    private SafeWallet getWalletOrNull(User user, PrintStream err) {

        try {
            SafeWallet wallet = new SafeWallet(user);

            return wallet;
        } catch (OverflowException e) {
//            err.println(e.getMessage());
            throw e;
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
            out.printf("%d. %-19.19s%2.2s%s", ++index, p.getName(), String.format("%d", p.getPrice()), System.lineSeparator());
//            out.println(String.format("%d. %s%-5d%s", ++index, p.getName(), p.getPrice(), System.lineSeparator()));
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

        } catch (OverflowException e) {
            throw e;
        } catch (RuntimeException e) {
            out.println(e.getMessage());
            return 0;
        } catch (Exception e) {
            return 0;
        }

        return 0;
    }
}
