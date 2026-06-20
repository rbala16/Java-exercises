public class Main {
    public static void main(String[] args) {
        /*
         * Composition = Represents a "part-of" relationship between objects.
         * For example, an Engine is "part of" a Car.
         * Engine cannot exist independently in this design.
         * Allows complex objects to be constructed from smaller objects.
         * 
         */

        // Creating a Car object
        Car car = new Car("Melibu", 2025, "V8");

        // Accessing Engine object through Car
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);
        // Starting the car
        car.start();
    }
}
