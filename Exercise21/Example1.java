import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        // A while loop repeats a block of code while a condition remains true.
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

        }
        // while ( 1 == 1){} infinite loop-> this condition cannnot change , i will stuck in this loop , keep runninh
        System.out.println("Hello " + name);

        scanner.close();
    }
}