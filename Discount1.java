import java.util.Scanner; // Import the Scanner class

public class Discount1 {
    public static double getDiscount1(double amount) {
        double discount1 = 0.0; // Initialize discount1

        // Use if statement condition
        if (amount > 5000) {
            discount1 = amount * 0.10; // >5000 discount = 10%
        } else if (amount > 1000 && amount <= 5000) {
            // Calculate discount for amounts >1000 and <=5000
            discount1 = amount * 0.05; // discount = 5%
        }

        return discount1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        // Prompt the user to enter the amount
        System.out.println("Please enter the amount:");
        double amount = scanner.nextDouble(); // Read user input

        double discount1 = getDiscount1(amount); // Call the method with user input
        System.out.println("The discount is: " + discount1); // Print the discount
    }
}
