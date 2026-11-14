class BankAccount {
    double balance = 5000;

    void withdraw(double amount) {
        if (amount > balance) {
            throw new ArithmeticException(
                    "Insufficient balance!");
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance = " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.withdraw(6000);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}