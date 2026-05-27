import java.util.Scanner;

public class WhileLoop1 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String password = "";

        // Why whilw loop not doo .. while
        // you want a user to keep entering a password until it becomes correct.
        //Keep running while password is NOT java123-> while loop stop when consition is false
        while (!password.equals("java123")) {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        }

        System.out.println("Access Granted!");

        scanner.close();
    }
}