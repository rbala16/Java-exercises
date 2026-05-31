public class Varargs {
    public static void main(String[] args) {
        /*
         * varargs = allow a method to accept a varying # of arguments
         * makes methods more flexible, no need for overloaded methods
         * java will pack the arguments into an array
         * ... (ellipsis)
         * Syntax
         * returnType methodName(datatype... variableName)
         */

      // Varargs means Passing multiple values to a method using a single parameter
      //Instead of writing multiple overloaded methods, we use ...
      //Varargs must be the LAST parameter
      System.out.println(add(1, 2, 3, 4));

        System.out.println(average(1, 2, 3, 4));

    }


    // sum of numbers

    // ...numbers (name of the array)
    //numbers :name of the array
    static int add(int... numbers) {
        // System.out.println(numbers); //given memory address
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;

    }

    // calculate average
    static double average(double... numbers) {

        double sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

}
