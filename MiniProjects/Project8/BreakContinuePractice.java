import java.util.Scanner;

public class BreakContinuePractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfRows;
        int numOfColumns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        numOfRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        numOfColumns = scanner.nextInt();
        System.out.print("Enter the symbol of use: ");
        symbol = scanner.next().charAt(0);

        for (int i = 1; i <= numOfRows; i++) {
            for (int j = 1; j <= numOfColumns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        scanner.close();

    }
}