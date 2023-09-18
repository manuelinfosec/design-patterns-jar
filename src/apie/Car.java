package apie;

public class Car extends Vehicle {
    // Dynamic polymorphism is achieved at runtime by overriding methods called
    // through reference to the object instance of belongingness
    @Override
    public void move(int speed) {
        System.out.println("Car moving");
    }

    // After createing a child class, `Car`` with a similar method named `move`. The
    // chield provides slightly differenct functions because the `Car` instance
    // moves faster than the parent instance.
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.move(23);
    }
}
