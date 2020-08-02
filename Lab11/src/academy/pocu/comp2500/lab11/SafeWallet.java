package academy.pocu.comp2500.lab11;

import academy.pocu.comp2500.lab11.pocu.User;
import academy.pocu.comp2500.lab11.pocu.Wallet;

public class SafeWallet extends Wallet {
    public SafeWallet(User user) throws IllegalAccessException {
        super(user);
    }

    @Override
    public boolean deposit(int amount) {
        if (amount < 0) {
            return false;
        }

        if (getAmount() > 0) {
            if ((long) getAmount() + (long) amount > Integer.MAX_VALUE) {
                throw new OverflowException("OverFlow amount");
            }
        } else {
            if ((long) getAmount() + (long) amount > Integer.MAX_VALUE) {
                throw new OverflowException("OverFlow amount");
            }
        }

        return super.deposit(amount);
    }
}
