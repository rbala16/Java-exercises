public class ForLoop {

    public static void main(String[] args) {
        // A for loop is used when you know how many times something should repeat.
        /*
         * for(initialization; condition; update) {
         * code
         * }
         * 1. Initialization e.g int i = 0;(i = index(counter) -> known as loop control
         * variable)
         * 2. Check condition
         * 3. Run code
         * 4. Update value
         * 5. Repeat
         * for(start; stop; change)->for(int i = 1; i <= 5; i++)->
         * Start at 1
         * Run until 5
         * Increase each time
         */

        // To increment
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }
        System.out.println("Increment :");
        for (int i = 1; i <= 10; i += 3) {
            System.out.println(i);
        }

        // To decrement
        // for (int i = 10; i > 0; i--) {
        // System.out.println(i);
        // }
        System.out.println("\nDecrement :");
        for (int i = 10; i > 0; i -= 3) {
            System.out.println(i);
        }
    }

}