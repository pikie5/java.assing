
// Parent class: Vehicle
class Vehicle {
    protected String brand;
    protected int speed;

    public void accelerate(int increase) {
        speed += increase;
    }

    public void brake(int decrease) {
        speed = Math.max(0, speed - decrease);
  
    }

    public void showDetails() {
        System.out.println("Vehicle Brand: " + brand + ", Speed: " + speed);
    }
}

// Subclass: Car
class Car extends Vehicle {
    int fuelLevel; // Fuel level as a percentage

    public void refuel(int amount) {
        fuelLevel = Math.min(100, fuelLevel + amount);
    }

    @Override
    public void showDetails() {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed + ", Fuel Level: " + fuelLevel + "%");
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    boolean helmetOn;

    public void wearHelmet() {
        helmetOn = true;
    }

    @Override
    public void showDetails() {
        System.out.println("Bike Brand: " + brand + ", Speed: " + speed + ", Helmet On: " + helmetOn);
    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        // Create and set up a Car object
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.speed = 60;
        myCar.fuelLevel = 50;

        myCar.accelerate(20);
        myCar.brake(30);
        myCar.refuel(30);
        myCar.showDetails();

        // Create and set up a Bike object
        Bike myBike = new Bike();
        myBike.brand = "Yamaha";
        myBike.speed = 40;
        myBike.helmetOn = false;

        myBike.accelerate(15);
        myBike.brake(10);
        myBike.wearHelmet();
        myBike.showDetails();
    }
}
