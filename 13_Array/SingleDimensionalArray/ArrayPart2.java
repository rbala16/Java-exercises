package SingleDimensionalArray;
import java.util.Scanner;

public class ArrayPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // make sure you assign the size of the array before you will assign the value
        // of the element
        // String[] foods = new String[3];

        int numOfItems;
        String[] foods;

        System.out.print("How many food items do you want: ");
        numOfItems = scanner.nextInt();
        scanner.nextLine(); // clear new line character in the input buffer

        //To enter the value into an array you 'll likely want to create an empty array,
        //  however you need to know the size of the array first
        foods = new String[numOfItems];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter the food item " + i + ": ");
            foods[i] = scanner.nextLine();

        }

        // element of the foods array
        for (String food : foods) {
            System.out.print(food.toUpperCase() + ", ");
        }

        scanner.close();

    }
}
