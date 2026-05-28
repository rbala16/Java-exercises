import java.util.Scanner;

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // JAVA BAKING PROGARM

        // declare variable
        double balance = 0;
        boolean isRunning = true;
        int choice;

        // display menu
        while (isRunning) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            // get and process users choice
            System.out.print("What would you like to do? (Enter your choice (1-4)): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }
        System.out.println("*************************");
        System.out.println("Thankyou have a nice day!");
        System.out.println("*************************");
        scanner.close();
    }

    // showBalance()
    static void showBalance(double balance) {
        System.out.printf("Current balance: $%.2f\n", balance);
    }

    // deposit()
    static double deposit() {
        double amount;

        System.out.println("Enter the amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount can't be zero or negative");
            return 0;
        } else {
            return amount;
        }

    }

    // withdraw()
    static double withdraw(double balance) {
        double amount;
        System.out.println("Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds");
            return 0;
        } else if (amount <= 0) {
            System.out.println("Amount can't be zero or negative");
            return 0;
        } else {
            return amount;
        }

    }

}