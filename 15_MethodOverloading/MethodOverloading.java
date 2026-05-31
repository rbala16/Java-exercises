public class MethodOverloading {

    public static void main(String[] args) {
        /*
         * overloaded methods = methods that share the same name,
         * but different parameters
         * signature = method name + its parameters
         * Each method signature needs to be unique
         * no two methods can share the same signature but they can share the same name
         */

        System.out.println(add(1, 3 , 6));
    }

    static double add(double a , double b ){
         return a + b;
    }
     static double add(double a , double b , double c ){
         return a + b + c;
    }
}
//Output 10.0