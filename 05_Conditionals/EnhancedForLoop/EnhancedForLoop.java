public class EnhancedForLoop {
    public static void main(String[] args) {
        /*
         * the enhanced for loop (also called for-each loop) is used to iterate over
         * arrays or collections easily without using indexes mainly for reading
         * elements.
         * For-Each Loop Syntax (Enhanced For Loop)***
         * Used to iterate through arrays or collections without using an index.
         * Read the : as "in":
         * 
         * for (dataType variableName : arrayOrCollection) {
         * // code to execute
         * }
         */

        int[] numbers = { 5, 10, 15, 20 };
        // “For each element in numbers, store it in num and run the loop
        for (int num : numbers) {
            System.out.println(num);
        }

        // Normal for loop
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println(numbers[i]);
        // }

        /*
         * No index (i) needed
         * Automatically picks each element one by one
         * Best for reading data only
         * Works with:
         * Arrays
         * ArrayList (and collections)
         */
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
