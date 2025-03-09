// Class to demonstrate method overloading
class Add {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three double values
    double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method to add a float and an integer
    float add(float a, int b) {
        return a + b;
    }
}

// Separate class for testing method overloading
public class Overload {
    public static void main(String[] args) {
        Add overloading = new Add();

        // Testing overloaded methods
        System.out.println("Addition of two integers: " + overloading.add(10, 20));
        System.out.println("Addition of three doubles: " + overloading.add(10.342, 20.65, 34.54));
        System.out.println("Addition of float and int: " + overloading.add(10.34F, 20));
    }
}
