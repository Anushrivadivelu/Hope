package task10;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankAccount {
    private double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        } else {
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        }
    }
    void deposit(double amount) {
        if (amount <= 0) {
            throw new ArithmeticException("Invalid");
        }
        balance += amount;
        System.out.println("Balance: " + balance);
    }
}
public class throwandthrows {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(5000);
        try {
            acc.deposit(1000);
            acc.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}