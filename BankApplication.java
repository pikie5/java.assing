// Abstract class representing a bank account
abstract class BankAccount {

    // Protected balance allows subclasses to access it directly (Consider making it private)
    protected double balance;

    // Constructor to initialize the bank account with a given balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Error! Amount should be positive");
        }
    }

    // Abstract method for withdrawing money, to be implemented by subclasses
    public abstract void withdraw(double amount);

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// SavingsAccount class extends BankAccount with an additional transaction fee
class SavingsAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.0; // Fee charged for each withdrawal

    // Constructor to initialize the savings account with a given balance
    public SavingsAccount(double balance) {
        super(balance);
    }

    // Withdraw method with an additional transaction fee
    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + TRANSACTION_FEE;
        if (totalAmount > 0 && totalAmount <= balance) {
            balance -= totalAmount;
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

// CheckingAccount class extends BankAccount without a transaction fee
class CheckingAccount extends BankAccount {

    // Constructor to initialize the checking account with a given balance
    public CheckingAccount(double balance) {
        super(balance);
    }

    // Withdraw method without additional fees
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

// Main class to test the BankAccount functionality
public class BankApplication {
    public static void main(String[] args) {
        // Creating a savings account with an initial balance of 1000
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(200); // Depositing money
        
