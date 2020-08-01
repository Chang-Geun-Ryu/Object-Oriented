package academy.pocu.comp2500.lab11;

import academy.pocu.comp2500.lab11.pocu.User;
import academy.pocu.comp2500.lab11.pocu.Wallet;

public class SafeWallet extends Wallet {
    public SafeWallet(User user) throws IllegalAccessException {
        super(user);
    }

    @Override
    public boolean deposit(int amount) throws OverflowException {
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

//        try {
//            int sum = getAmount() + amount;
//        } catch (ArithmeticException e) {
//            throw new OverflowException("OverFlow!");
//        }

        if ((long)getAmount() + (long)amount > Integer.MAX_VALUE) {
            throw new OverflowException("OverFlow amount");
        }

        if ((long)getAmount() + (long)amount < Integer.MIN_VALUE) {
            throw new OverflowException("OverFlow amount");
        }

        return super.deposit(amount);
    }
}
