import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    // Shared Random object (better performance)
    static Random random = new Random();

    public static void main(String[] args) {
        // JAVA SLOT MACHINE
        Scanner scanner = new Scanner(System.in);

        // declare variable
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // Game welcome screen

        System.out.println("*************************");
        System.out.println("Welcome to Java Slots  ");
        System.out.println("Symbols: CH | WM | LM | BL | ST");
        System.out.println("*************************");

        // Main game loop (runs until user quits or balance becomes 0)
        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            // Validate bet
            if (bet > balance) {
                System.out.println("Insuffient funds");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than zero");
            } else {
                // Deduct bet from balance
                balance -= bet;
                System.out.println("Balance is: $" + balance);
            }

            // Spin the slot machine

            System.out.println("Spinning");
            row = spinRow();
            printRow(row);

            // Calculate payout
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry you lost this round");
            }

            // Ask user if you want to continue playing
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }

        }
        // Game over message
        System.out.println("GAME OVER! Your final balance is $" + balance);
        scanner.close();
    }

    // Spin the slot machine (generates 3 random symbols)
    static String[] spinRow() {

        String[] symbols = { "CH", "WM", "LM", "BL", "ST" };
        String[] row = new String[3];

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    // Print the slot result
    static void printRow(String[] row) {
        System.out.println("**************************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************************");
    }

    // Calculate payout based on matching symbols
    static int getPayout(String[] row, int bet) {

        // All 3 match
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "CH" -> bet * 3;
                case "WM" -> bet * 4;
                case "LM" -> bet * 5;
                case "BL" -> bet * 10;
                case "ST" -> bet * 20;
                default -> 0;
            };
        }
        // First two match
        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "CH" -> bet * 2;
                case "WM" -> bet * 3;
                case "LM" -> bet * 4;
                case "BL" -> bet * 5;
                case "ST" -> bet * 10;
                default -> 0;
            };
        }
        // Last two match
        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "CH" -> bet * 2;
                case "WM" -> bet * 3;
                case "LM" -> bet * 4;
                case "BL" -> bet * 5;
                case "ST" -> bet * 10;
                default -> 0;
            };
        }
        // No match
        return 0;

    }
}