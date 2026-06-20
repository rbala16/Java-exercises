public class Car {

    String model;
    int year;
    /*
     * Composition:
     * Car owns an Engine object
     */
    Engine engine;

    // Constructor
    Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        /*
         * Engine object is created INSIDE Car
         * Strong ownership relationship
         */
        this.engine = new Engine(engineType);
    }

    // Start the car
    void start() {
        // Call Engine's start method
        this.engine.start();
        System.out.println("This " + this.model);
    }
}
