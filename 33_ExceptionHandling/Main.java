import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * EXCEPTION HANDLING
         * ------------------
         * Exception = An event that interrupts the normal flow of a program
         * Exception Handling is used to prevent a program from crashing when an error
         * occurs
         * Exception = an error that occurs while the program is running
         * (Dividing by zero, file not found, mismatch input type)
         * Surround any dangerous code with a try{} block
         * try{}, catch{}, finally{}
         */
        Scanner scanner = new Scanner(System.in);

        try {
            /*
             * Code inside try{} is considered "dangerous code"
             * because it may throw an exception.
             */
            System.out.print("Enter a number: ");
            // May throw InputMismatchException
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            /*
             * Executes if the user enters
             * something other than an integer.
             */
            System.out.println("That wasn't a number");
        } catch (ArithmeticException e) {
            // Executes when dividing by zero.( 10 / 0)
            System.out.println("You can't divide by zero");
        } catch (Exception e) {
            /*
             * Generic catch block.
             * Handles any exception not handled above.
             */
            System.out.println("Something went wrong");
        } finally {
            /*
             * Always executes.
             * Whether an exception occurs or not.
             *
             * Commonly used for:
             * - Closing files
             * - Closing scanners
             * - Releasing resources
             */
            scanner.close();
            System.out.println("This always exceutes");
        }

    }
}