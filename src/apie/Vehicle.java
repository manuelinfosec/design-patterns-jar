package apie;

/**
 * Encapsulation
 * An instance of an imagiginary vehicl is created. All functions that should be
 * exposed to the driver are encapsulated.
 */

public class Vehicle {
    // In such an imaginary vehicle, all internal elements and internal functions
    // remain hidden from the driver. Only exposing the functionality it serves.
    private boolean moving;

    // A method can work over an object and chage the internal state of its field
    public void move(int speed) {
        this.moving = true;
        System.out.println("Moving...");
    }

    // Static polymorphism is achieved by method overloading. This allows the
    // moveeent of the vehicle to happen differently based on the inputs or the
    // state of the instance. Method overloading can be achieved by changing the
    // argument type.
    public void move(double speed) {
        this.moving = true;
        System.out.println("Overloaded movement by type...");
    }

    // Method overloading can also be achieved by changing the number of arguments
    public void move(int speed, boolean forward) {
        this.moving = true;
        System.out.println("Overloaded movement by number of argumnets...");
    }

    // It's good practice to use methods to modify the inners instance of an
    // instance.
    public void stop() {
        this.moving = false;
        System.out.println("Stopped...");
    }
}