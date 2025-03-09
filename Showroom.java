import java.util.Scanner;

// Car class to represent a vehicle with various attributes
class Car {
    // Private fields to ensure encapsulation
    private String brand;
    private String model;
    private int year;
    private String fuelType;

    // Constructor to initialize the car object
    public Car(String brand, String model, int year, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Main class to handle user input and display car information
public class Showroom {
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter car details
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine(); // Read brand name

        System.out.print("Enter Model: ");
        String model = scanner.nextLine(); // Read model name

        System.out.print("Enter Year: ");
        int year = scanner.nextInt(); // Read manufacturing year
        scanner.nextLine(); // Consume the leftover newline character

        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine(); // Read fuel type

        // Create a Car object with user-provided details
        Car car = new Car(brand, model, year, fuelType);

        // Display the entered car details
        System.out.println("\nCar Details:");
        car.displayDetails();

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
