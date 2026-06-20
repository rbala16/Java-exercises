public class Main {
    public static void main(String[] args) {

        /*
         * ENCAPSULATION:
         * - Protects data using private variables
         * - Controls access using getters & setters
         * GETTERS = Methods that make a field READABLE.
         * SETTERS = Methods that make a field WRITEABLE.
         * getters and setters - They help protect object data and add rules for
         * accessing or modifying them.
         */

        // Creating Car object
        Car car = new Car("Elentra", "White", 10000);

        /*
         * We CANNOT directly change fields now:
         * car.color = "Blue"; ❌ (private access blocked)
         *
         * Instead we use setter methods
         */
        car.setColor("Blue"); // safe update
        car.setPrice(6000); // controlled update (with validation)

        /*
         * Accessing data using getters
         */
        System.out.println(car.getColor() + " " +
                car.getModel() + " " +
                car.getPrice());
    }
}