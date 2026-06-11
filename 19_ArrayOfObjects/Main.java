public class Main {
    public static void main(String[] args) {

        /*
         * STEP 1: Creating Car objects separately (normal way)
         * Each object is stored in a variable first
         */

        // Car car1 = new Car("Elentra", "Black");
        // Car car2 = new Car("Civic", "white");
        // Car car3 = new Car("Melibu", "White");

        // Step 2: Store objects inside an array
        // Car[] cars = new Car[3];
        // Car[] cars = { car1, car2, car3 }; OR

        /*
         * STEP 1: Anonymous objects inside array (shortcut way)
         * We directly create objects inside the array
         */
        Car[] cars = { new Car("Elentra", "Black"),
                new Car("Civic", "white"),
                new Car("Melibu", "White") };

        // for(int i = 0 ; i < cars.length ; i++){
        // cars[i].drive();
        // }

        /*
         * STEP 4: Using enhanced for loop (for-each loop)
         * This loop goes through each Car object in the array
         * data type of each element within this array is Car
         */

        for (Car car : cars) {
            car.color = "black"; // changing the color of each car object
        }

        /*
         * STEP 5: Calling method on each object
         * This prints model + color of each car
         */
        for (Car car : cars) {
            car.drive();
        }

    }
}