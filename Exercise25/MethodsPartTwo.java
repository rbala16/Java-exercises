public class MethodsPartTwo {
    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called ()
        // return keyword will return the value after the method ends and it will
        // return thst value back to the place in whuch you call that method
        System.out.println(square(3));
        // double result = square(3);
        // System.out.println(result);
        System.out.println(cube(3));

        System.out.println(getFullName("John", "Brar"));

        int age = 21;
        if(ageCheck(age)){
              System.out.println("You may sign up !");
        }
        else{
            System.out.println("You must be 18+ to sign up !");
        }
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck (int age){
        if (age>=18) {
            return true;
        }
        else{
            return false;
        }
    }
}
