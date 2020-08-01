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

    public void run(BufferedReader in, PrintStream out, PrintStream err) {
        Warehouse warehouse = null;
        SafeWallet wallet = null;
        User user = null;

        do {
            { // : 1
                int index = 0;
                int num = 0;

                out.println("WAREHOUSE: Choose your warehouse!");
                for (WarehouseType type : WarehouseType.values()) {
                    out.printf("%d. %s%s", ++index, type, System.lineSeparator());
                }

                try {
                    String s = in.readLine();
                    if (s == null) {
                        continue;
                    }

                    if (s.length() == 4 && s.equals("exit") || WarehouseType.values().length == 0) {  // exit
                        return;
                    }

                    String length = String.format("%d", WarehouseType.values().length);
                    if (length.length() > s.length()) {
                        continue;
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
                        continue;
                    }

                    if (s.equals(String.format("%d", num)) == false) {
                        continue;
                    }

                    if (num < 1 || num > WarehouseType.values().length) {
                        continue;
                        //throw new IllegalArgumentException(String.format("For input string: %s", s));
                    }
                } catch (IOException e) {
//                    err.println(e.getMessage());
                    continue;
                } /*catch (NumberFormatException e) {
                    err.println(e.getMessage());
                    continue;
                }*/

                if (WarehouseType.values().length >= 0) {
                    if (num >= 1 && num <= WarehouseType.values().length) {
                        index = 0;
                        HashMap<Integer, WarehouseType> types = new HashMap<>();
                        for (WarehouseType type : WarehouseType.values()) {
                            types.put(++index, type);
                        }

                        if (types.containsKey(num)) {
                            warehouse = new Warehouse(types.get(num));
                        }
                    } else {
                        continue;
                    }
                } else {
                    return;
                }
            }
        } while (warehouse == null);

        try {
            user = new User();
            wallet = new SafeWallet(user);
        } catch (IllegalAccessException e) {
            err.println("AUTH_ERROR");
            return;
        }

        do {
            {   // : 21
//                try {
                out.println(String.format("BALANCE: %d", wallet.getAmount()));
                out.println("PRODUCT_LIST: Choose the product you want to buy!");
                int num = 0;
                int index = 0;
                for (Product p : warehouse.getProducts()) {
                    out.printf("%d. %-19.19s%2.2s%s", ++index, p.getName(), String.format("%d", p.getPrice()), System.lineSeparator());
                }

                try {
                    String s = in.readLine();
                    if (s == null) {
                        continue;
                    }

                    if (s.length() == 4 && s.equals("exit") || warehouse.getProducts().size() == 0) {  // exit
                        return;
                    }

                    String length = String.format("%d", warehouse.getProducts().size());
                    if (length.length() > s.length()) {
                        continue;
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
                        continue;
                    }

                    if (s.equals(String.format("%d", num)) == false) {
                        continue;
                    }

                    if (num < 1 || num > warehouse.getProducts().size()) {
                        continue;
                        //throw new IllegalArgumentException(String.format("For input string: %s", s));
                    }
                } catch (IOException e) {
//                    err.println(e.getMessage());
                    continue;
                } /*catch (NumberFormatException e) {
                    err.println(e.getMessage());
                    continue;
                }*/

                if (warehouse.getProducts().size() >= 0) {
                    if (num >= 1 && num <= warehouse.getProducts().size()) {
                        index = 0;
                        HashMap<Integer, Product> products = new HashMap<>();
                        for (Product p : warehouse.getProducts()) {
                            products.put(++index, p);
                        }

                        if (products.containsKey(num)) {
                            Product p = products.get(num);
                            int price = p.getPrice();
                            UUID id = p.getId();
//                            try {
                                if (wallet.getAmount() - price >= 0) {
                                    if (wallet.withdraw(price)) {
                                        warehouse.removeProduct(id);
                                    } else {
                                        continue;
                                    }
                                }
//                            } catch (ProductNotFoundException e) {
//                                wallet.deposit(price);
//                                err.println(e.getMessage());
//                                continue;
//                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    return;
                }
            }
        } while (true);

    }
}
