import java.util.Scanner;

public class Showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for car details
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Create Car object
        Car car = new Car(brand, model, year, fuelType);

        // Display car details
        System.out.println("\nCar Details:");
        car.displayDetails();

        scanner.close();
    }
}
   

