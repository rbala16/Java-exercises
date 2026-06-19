public class Main {
    public static void main(String[] args) {
        /*
         * INTERFACE:
         * - A blueprint for classes
         * - Contains ONLY abstract methods (by default)
         * - Forces implementing classes to define methods(CLASS MUST DEFINE)
         * - Supports multiple inheritance (a class can implement many interfaces)
         */

        // Creating objects of classes implementing interfaces
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        /*
         * Calling interface methods implemented by each class
         * Each class has its own behavior
         */
        rabbit.flee(); // Rabbit only runs away
        hawk.hunt(); // Hawk only hunts

        // Fish can both flee and hunt (implements 2 interfaces)
        fish.flee();
        fish.hunt();

    }
}