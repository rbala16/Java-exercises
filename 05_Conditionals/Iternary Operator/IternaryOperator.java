public class IternaryOperator {
    public static void main(String[] args) {
        // ternary operator ? = Return 1 of 2 values if a condition is true
        // It is similar version of if else statements
        // variable = (condition) ? IfTrue : IfFalse;
        // (condition) ? value_if_true : value_if_false;

        // A ternary operator in Java is a short way to write an if-else statement.

        // EXAMPLE1
        int score = 98;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println("Student is " + passOrFail);

        // EXAMPLE2
        int number = 6;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println("The number is " + evenOrOdd);

        // EXAMPLE3
        int hours = 13;

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println("Its is " + timeOfDay);

        // EXAMPLE4
        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println("Tax is " + taxRate);

    }

}
