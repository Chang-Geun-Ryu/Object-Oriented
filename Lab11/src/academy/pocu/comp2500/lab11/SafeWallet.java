package academy.pocu.comp2500.lab11;

import academy.pocu.comp2500.lab11.pocu.User;
import academy.pocu.comp2500.lab11.pocu.Wallet;

public class SafeWallet extends Wallet {
    public SafeWallet(User user) throws IllegalAccessException {
        super(user);
    }

    @Override
    public boolean deposit(int amount) {
//        if (amount <= 0) {
//            amount = 0;
//        }

//        if (getAmount() > 0) {
//            if (amount > Integer.MAX_VALUE - getAmount()) {
//                throw new OverflowException("OverFlow!");
//            }
//        } else {
//            if (amount < Integer.MIN_VALUE - getAmount()) {
//                throw new OverflowException("UnderFlow!");
//            }
//        }

        try {
            int sum = getAmount() + amount;
        } catch (ArithmeticException e) {
            throw new OverflowException("OverFlow!");
        }

        return super.deposit(amount);
    }
}
