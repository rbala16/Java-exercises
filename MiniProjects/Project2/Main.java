import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   // Shooping cart program
        Scanner scanner = new Scanner(System.in);

        System.out.print("What kind a item would you like to buy? ");
        String item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        double price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        int quantity = scanner.nextInt();

        double totalPrice = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is $" + totalPrice);

        scanner.close();
    }
}