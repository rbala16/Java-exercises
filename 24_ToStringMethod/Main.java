public class Main {
    public static void main(String[] args) {

        /*
         * .toString() = Method inherited from the Object class.
         * Used to return a string representation of an object or convert an object into a String representation
         * By default, it returns a hash code as a unique identifier.
         * It can be overridden to provide meaningful details.OR
         
         * .toString() METHOD:
         * - Comes from the Object class (parent of all classes in Java)
         * - Every class automatically has it
         *
         * PURPOSE:
         * - Converts an object into a String representation
         * - Used when printing objects
         *
         * DEFAULT BEHAVIOR:
         * - If NOT overridden → prints memory address / hash code
         *
         * CUSTOM BEHAVIOR:
         * - If overridden → prints meaningful object details

         */

         // Creating Car objects
        Car car1 = new Car("Ford", "Mustang", 2021, "Black");
        Car car2 = new Car("Chevrolet", "Melibu", 2026, "White");

         /*
         * Without toString() override:
         * System.out.println(car1);
         * → prints memory reference (not useful)
         */
        // System.out.println(car1); //memory address
        // System.out.println(car1.color + " " + car1.year + " " + car1.make + " " + car1.model);
        
        // Printing objects car1 and car2
        System.out.println(car1);
        System.out.println(car2);
    }
}