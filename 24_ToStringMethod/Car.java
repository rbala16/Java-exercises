public class Car {
    String make;
    String model;
    int year;
    String color;
 /*
     * Constructor
     * Runs when object is created using 'new Car(...)'
     * Used to initialize all attributes of the car
     */
    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
 /*
     * toString() METHOD
     * - Inherited from Object class
     * - Automatically called when you print the object
     *
     * @Override means:
     * - We are replacing the default version of toString()
     * - Default version prints memory address (not useful)
     *
     * Now it returns meaningful details about the Car object
     */
    @Override
    public String toString() {
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
