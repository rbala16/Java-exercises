import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /*
         * ArrayList:
         * A dynamic (resizable) array that stores food names.
         * Starts empty and grows as we add items.
         */
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like to store:");
        int numOfFruits = scanner.nextInt();
        /*
         * IMPORTANT:
         * nextInt() reads only the number.
         * It leaves the Enter key ('\n') behind.
         *
         * This nextLine() removes that leftover Enter.
         * Otherwise, the first food input would be skipped.
         */
        scanner.nextLine();

        for(int i= 1 ; i <= numOfFruits ; i++){
            System.out.print("Enter food # : ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}
