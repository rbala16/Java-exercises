import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /*
         * RUNTIME POLYMORPHISM:
         * - Method execution decided at runtime (not compile time)
         * - Based on actual object type (Dog or Cat)
         * - also called Method Overriding
         */
        Scanner scanner = new Scanner(System.in);

         // Parent reference
        Animal animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        /*
         * User input decides WHICH object is created
         * But reference type is always Animal
         */
         if (choice == 1) {
            animal = new Dog();   // Dog object stored in Animal reference
            animal.speak();       // Dog version runs
        }

        else if (choice == 2) {
            animal = new Cat();   // Cat object stored in Animal reference
            animal.speak();       // Cat version runs
        }

        scanner.close();
    }
}