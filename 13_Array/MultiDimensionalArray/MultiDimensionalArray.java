public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
         * 2D array = An array where each element is an array , also known as multi
         * demensional array
         * A 2D array is an array of arrays.
         * Useful for storing a matrix of data
         * Access using array[row][column]
         */

        // ONE DEMENSIONAL ARRAY
        // String[] fruits = { "apple", "orange", "banana" };
        // String[] vegetables = { "potato", "onions", "carrots" };
        // String[] snacks = { "crackers", "chips", "kurkure" };
        // String[][] groceries = {fruits,vegetables,snacks};

        // 2D ARRAY- A 2D array is an array of arrays.

        String[][] groceries = { { "apple", "orange", "banana" },
                { "potato", "onions", "carrots" },
                { "crackers", "chips", "kurkure" } };

        groceries[0][0] = "pineaaple";
        groceries[1][0] = "celery";
        groceries[1][2] = "potatoChips";

        for (String[] foods : groceries) {
            // System.out.println(foods);// got bunch of address cause array is a reference
            // data tyoe , we are referring some data in the memory
            for (String food : foods) {
                System.out.print(food + " ");
            }
            // after finishing each array , add new line character
            System.out.println();
        }

    }
}
