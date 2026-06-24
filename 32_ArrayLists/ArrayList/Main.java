package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*
         * ArrayList
         * ----------
         * ArrayList = A resizeable array that stores objects (autoboxing)
         * Arrays are fixed in size, but ArrayLists can change
         * A resizable array that stores objects.
         * Unlike arrays, ArrayLists can grow and shrink in size.
         *
         * Syntax:
         * ArrayList<DataType> list = new ArrayList<>();
         */

        // ArrayList of Integer objects
        ArrayList<Integer> list = new ArrayList<>();
        // Add elements
        list.add(3);
        list.add(1);
        list.add(2);
        // Print entire list
        System.out.println(list);

        /*
         * Autoboxing:
         * int -> Integer automatically
         */
        // ArrayList of Double objects
        ArrayList<Double> secondList = new ArrayList<>();
        secondList.add(3.33);
        secondList.add(1.78);
        secondList.add(2.67);

        System.out.println(secondList);

        // ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("PineApple");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println(fruits);

        /*
         * remove(index)
         * Removes element at specified index
         *
         * Index:
         * Orange = 0
         * Mango = 1
         * PineApple = 2
         * Banana = 3
         * Apple = 4
         */
        fruits.remove(0);
        /*
         * set(index, value)
         * Replaces an existing element
         */
        fruits.set(0, "Coconut");
        System.out.println(fruits);
        /*
         * get(index)
         * Returns element at specified index
         */
        System.out.println(fruits.get(1));
        /*
         * Collections.sort()
         * Sorts elements alphabetically
         */
        Collections.sort(fruits);
        System.out.println(fruits);

        /*
         * Enhanced For Loop
         * Iterates through every element
         */
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        /*
         * Other useful ArrayList methods:
         *
         * fruits.size() -> number of elements
         * fruits.contains() -> check if element exists
         * fruits.clear() -> remove all elements
         * fruits.isEmpty() -> check if list is empty
         */
    }
}