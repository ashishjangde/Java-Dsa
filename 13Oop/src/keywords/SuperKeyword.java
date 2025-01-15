package keywords;



public class SuperKeyword {
    public static void main(String[] args) {
        Car car = new Car(180); // Passing value to the Car constructor
        car.display();
        car.showSpeed();
    }
}


class Vehicle {
    int maxSpeed;

    Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle is created with max speed: " + maxSpeed);
    }

    // Parent class method
    void display() {
        System.out.println("Vehicle speed: " + maxSpeed);
    }
}

// Child class
class Car extends Vehicle {
    int maxSpeed;

    Car(int maxSpeed) {
        // Calling the parent class constructor with value
        super(maxSpeed - 40); // Example of adjusting the value
        this.maxSpeed = maxSpeed;
        System.out.println("Car is created with max speed: " + maxSpeed);
    }

    // Child class method
    void display() {
        super.display();
        System.out.println("Car speed: " + maxSpeed);
    }

    // Method to show data member access
    void showSpeed() {
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Parent class max speed: " + super.maxSpeed);
    }
}


