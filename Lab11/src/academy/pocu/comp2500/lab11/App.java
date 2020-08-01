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
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.UUID;

public class App {

    public void run(BufferedReader in, PrintStream out, PrintStream err) throws OverflowException {
        Warehouse warehouse = null;
        SafeWallet wallet = null;
        User user = null;

        do {
            { // : 1
                int index = 0;
                HashMap<Integer, WarehouseType> types = new HashMap<>();
                out.println("WAREHOUSE: Choose your warehouse!");
                for (WarehouseType type : WarehouseType.values()) {
                    out.printf("%d. %s%s", ++index, type, System.lineSeparator());
                    types.put(index, type);
                }

                int num = getWareHouseIndex(in, out, err);

                if (num == -1) {
                    return;
                }

                if (types.containsKey(num)) {
                    if (types.get(num) != null) {
                        warehouse = new Warehouse(types.get(num));
                    } else {
                        continue;
                    }
                }

            }
        } while (warehouse == null);

        try {
            user = new User();
            wallet = new SafeWallet(user);
        } catch (IllegalAccessException e) {
            err.println("AUTH_ERROR");
            return;
        } catch (IllegalArgumentException e) {
            err.println("AUTH_ERROR");
            return;
        }

        do {
            out.println(String.format("BALANCE: %d", wallet.getAmount()));
            out.println("PRODUCT_LIST: Choose the product you want to buy!");
            int num = 0;
            int index = 0;
            HashMap<Integer, Product> products = new HashMap<>();
            for (Product p : warehouse.getProducts()) {
                out.printf("%d. %-19.19s%10s%s", ++index, p.getName(), String.format("%d", p.getPrice()), System.lineSeparator());
                products.put(index, p);
            }

            num = getProductIndex(warehouse, in, out, err);

            if (num == -1) {
                return;
            }

            if (products.containsKey(num)) {
                Product p = products.get(num);
                int price = p.getPrice();
                UUID id = p.getId();
                boolean isWithdrawal = false;
                try {
                    isWithdrawal = wallet.withdraw(price);
                    if (isWithdrawal) {
                        warehouse.removeProduct(id);
                    }
                    wallet.deposit(Integer.MAX_VALUE);
                } catch (ProductNotFoundException e) {
                    if (isWithdrawal) {
                        wallet.deposit(price);


                    }
//                    wallet.deposit(Integer.MIN_VALUE);
                }
            }
        } while (true);
    }

    private int getWareHouseIndex(BufferedReader in, PrintStream out, PrintStream err) {
        int num = 0;
        try {
            String s = in.readLine();
            if (s == null) {
                return 0;
            }

            if (s.length() == 4 && s.equals("exit") || WarehouseType.values().length == 0) {  // exit
                return -1;
            }

            String length = String.format("%d", WarehouseType.values().length);
            if (length.length() > s.length()) {
                return 0;
            }

            boolean isDigit = true;
            for (int i = 0; i < length.length(); ++i) {
                if (Character.isDigit(s.charAt(i)) == false) {
                    isDigit = false;
                }
            }
            if (isDigit) {
                num = Integer.parseInt(s);
            } else {
                return 0;
            }

            if (s.equals(String.format("%d", num)) == false) {
                return 0;
            }

            if (num < 1 || num > WarehouseType.values().length) {
                return 0;
                //throw new IllegalArgumentException(String.format("For input string: %s", s));
            }

            return num;
        } catch (IOException e) {
            return 0;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private int getProductIndex(Warehouse warehouse, BufferedReader in, PrintStream out, PrintStream err) {
        try {
            int num = 0;
            String s = in.readLine();
            if (s == null) {
                return 0;
            }

            if (s.length() == 4 && s.equals("exit") || warehouse.getProducts().size() == 0) {  // exit
                return -1;
            }

            String length = String.format("%d", warehouse.getProducts().size());
            if (length.length() > s.length()) {
                return 0;
            }

            boolean isDigit = true;
            for (int i = 0; i < length.length(); ++i) {
                if (Character.isDigit(s.charAt(i)) == false) {
                    isDigit = false;
                }
            }
            if (isDigit) {
                num = Integer.parseInt(s);
            } else {
                return 0;
            }

            if (s.equals(String.format("%d", num)) == false) {
                return 0;
            }

            if (num < 1 || num > warehouse.getProducts().size()) {
                return 0;
            }
            return num;
        } catch (IOException e) {
            return 0;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
