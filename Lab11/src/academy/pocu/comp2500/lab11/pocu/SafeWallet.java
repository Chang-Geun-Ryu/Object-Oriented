package academy.pocu.comp2500.lab11.pocu;

public class SafeWallet extends Wallet {
    public SafeWallet(User user) throws IllegalAccessException {
        super(user);
    }

    @Override
    public boolean deposit(int amount) {
        if (amount <= 0) {
            amount = 0;
        }

        if (amount > Integer.MAX_VALUE - getAmount()) {
            throw new OverflowException("OverFlow!");
        }

        return super.deposit(amount);
    }
}
