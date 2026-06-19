public class Car {
    // Properties (variables of the class)
    String model;
    String color;

    /*
     * Constructor
     * Runs automatically when we create a new Car object
     */
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    /*
     * Method: drive()
     * Prints details of the car object
     */
    void drive() {
        System.out.println("You drive the " + this.model + " " + this.color);
    }
}
