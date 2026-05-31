public class VariableScope {

    /*
     * Local variable gets higher priority
     * Local variables are checked first inside the method.
     * inside class but outside methods
     * Methods can access class variables directly if there is no local variable
     * with same name.
     */
    static int x = 3; // CLASS SCOPE

    public static void main(String[] args) {

        // variable scope = where a variable can be accessed

        // variable declared inside the method has a local slope
        int x = 1; // LOCAL
        System.out.println(x);

        doSomething(); // 2 because this method has local slope where x is 2 , this method is not aware
                       // about existance of x variable inside main method
    }

    static void doSomething() {
        int x = 2; // LOCAL
        System.out.println(x);
    }
}