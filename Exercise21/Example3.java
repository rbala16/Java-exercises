import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        int age = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        // if condition is false , while loop don't run
        while (age < 0) {
            System.out.println("Age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        // do the code first and check the condition at the end
        // do {
        // System.out.println("Age can't be negative");
        // System.out.print("Enter your age: ");
        // age = scanner.nextInt();
        // }while (age < 0);

        System.out.println("You are " + age + " years old");

        scanner.close();
    }
}
