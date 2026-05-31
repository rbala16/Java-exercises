import java.util.Scanner;

public class DoWhileLoop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        // Why do...while here?
        // Because the menu must appear at least one time before checking the condition.
        // Even if the user enters 2 immediately:The menu still showed once.
        do {
            System.out.println("1. Play Game");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();

        } while (choice != 2);

        System.out.println("Game Closed");

        scanner.close();
    }
}
