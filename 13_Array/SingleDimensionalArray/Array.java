package SingleDimensionalArray;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        // array = a collection of values of the same data type
        // * think of it as a variable that can store more than 1 value *

        // String fruit = "apple";
        // Each value with in a array as known as element
        String[] fruits = { "apple", "orange", "banana", "coconut" }; // array can store more than one value
        // System.out.println(fruits); // you will get memory address

        System.out.println(fruits[0]); // index of 0 will give you first element

        // change the value of the element
        fruits[0] = "pineapple";
        System.out.println("The first element of the array: " + fruits[0]);

        // length of the array
        int numOfFruits = fruits.length;
        System.out.println("The length of the arary: " + numOfFruits); // 4

        // Sort an array( arrsy in asending order)
        Arrays.sort(fruits);

        // fill the array with the value of pineapple
        // Arrays.fill(fruits, "apple");

        // Access of the element of the array
        // for(int i = 0; i < fruits.length; i++){
        // System.out.print(fruits[i] + ", ");
        // }

        /***
         * For-Each Loop Syntax (Enhanced For Loop)***
         * Used to iterate through arrays or collections without using an index.
         * Read the : as "in":
         * 
         * for (dataType variableName : arrayOrCollection) {
         * // code to execute
         * }
         */

        for (String fruit : fruits) {
            System.out.print(fruit + ", ");
        }

    }
}