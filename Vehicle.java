// Base class Vehicle
public class Vehicle {
    protected String brand;   // Define the BankAccount class
class BankAccount {
    // Declare balance as private to restrict direct access
    private double balance;

    // Constructor to initialize balance (optional)
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    // Getter method to retrieve balance
    public double getBalance() {
        return balance; 
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) { 
            balance += amount; // Increase balance
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > balance) { // Prevent overdraft
            System.out.println("Insufficient account balance");
        } else if (amount > 0) {
            balance -= amount; 
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}

// Main class to test the BankAccount functionality
public class BankApp {
    public static void main(String[] args) {
        // Create a BankAccount object with an initial balance of $1000
        BankAccount myAccount = new BankAccount(1000);

        // Display initial balance
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        // Perform deposit and withdrawal transactions
        myAccount.deposit(500);  // Deposit $500
        System.out.println("Updated Balance: $" + myAccount.getBalance());

        myAccount.withdraw(300); // Withdraw $300
        System.out.println("Updated Balance: $" + myAccount.getBalance());

        myAccount.withdraw(1500); // Attempt to withdraw more than the balance
        System.out.println("Final Balance: $" + myAccount.getBalance());
    }
}

    protected String model;  
    protected int year;       

    // Constructor to initialize the Vehicle object
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display the details of the vehicle
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Derived class Car that extends the Vehicle class
public class Car extends Vehicle {
    private String fuelType; 

    // Constructor to initialize the Car object
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); 
        this.fuelType = fuelType;   
    }

    // Overridden method to display the details of the car
    
    public void displayDetails() {
        super.displayDetails();   
        System.out.println("Fuel Type: " + fuelType);
    }
}


       