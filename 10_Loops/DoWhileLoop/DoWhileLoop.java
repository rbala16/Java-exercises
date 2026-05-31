import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        //do...while runs once before checking the condition.
        //A do...while loop executes the statements first, then checks the condition.
        do {
            System.out.print("Enter the number between 1 top 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("You picked the number: " + number);
        scanner.close();
    }
}
