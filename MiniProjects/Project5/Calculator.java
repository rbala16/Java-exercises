import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double result;
        // double result = 0;
        // boolean validOperation = true;

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                if (secondNumber == 0) {
                    System.out.println("Can't divide by zero");
                    // validOperation = false;
                    return;
                } else {
                    result = firstNumber / secondNumber;
                }
            }
            case '^' -> result = Math.pow(firstNumber, secondNumber);
            default -> {
                System.out.println("Invalid operator!");
                // validOperation = false;
                return;
            }
        }

        // if (validOperation) {
        //     System.out.printf("Result: %.2f%n", result);
        // }
       
       System.out.printf("Result: %.2f%n", result);
        scanner.close();
    }
}
