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
        } catch (IllegalArgumentException e) {
            err.println(e.getMessage());
            return;
        } catch (IllegalAccessException e) {
            err.println("AUTH_ERROR");
            return;
        }

        do {
            {   // : 2
                try {
                    out.println(String.format("BALANCE: %d", wallet.getAmount()));
                    out.println("PRODUCT_LIST: Choose the product you want to buy!");

                    int index = 0;
                    for (Product p : warehouse.getProducts()) {
                        out.printf("%d. %-19.19s%2.2s%s", ++index, p.getName(), String.format("%d", p.getPrice()), System.lineSeparator());
                    }

                    String s = in.readLine();
                    if (s == null) {
                        continue;
                    }

                    if (s.length() == 4 && s.equals("exit")) {  // exit
                        return;
                    }

                    int num = Integer.parseInt(s);

                    if (num < 1 || num > warehouse.getProducts().size()) {
                        throw new IllegalArgumentException(String.format("For input string: %s", s));
                    }

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
                                try {
                                    if (wallet.getAmount() - price >= 0) {
                                        wallet.withdraw(price);
                                        warehouse.removeProduct(id);
                                    }
                                } catch (ProductNotFoundException e) {
                                    wallet.deposit(price);
                                    err.println(e.getMessage());
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        return;
                    }

                } catch (IllegalArgumentException e) {
//                    err.println(e.getMessage());
                    continue;
                } catch (IOException e) {
                    err.println(e.getMessage());
                    continue;
                }
            }
        } while (true);




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
            out.println("WAREHOUSE: Choose your warehouse!");
            int index = 0;
            for (WarehouseType type : WarehouseType.values()) {
                out.printf("%d. %s%s", ++index, type, System.lineSeparator());
            }

            int warehouseNum = 0;
            if (warehouseNum == -1) {
                return null;
            }

            try {
//                if (types.containsKey(warehouseNum)) {
//                    warehouse = new Warehouse(types.get(warehouseNum));
//                }
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
