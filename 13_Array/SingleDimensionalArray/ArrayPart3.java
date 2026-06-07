package SingleDimensionalArray;
import java.util.Scanner;

public class ArrayPart3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int[] numbers = {1, 9, 5, 3, 8, 3, 2};
        // int target = 9; // what numbre are we searching for ?

        String[] fruits = { "apple", "orange", "banana" };
        boolean isFound = false;
        System.out.print("Enter the fruit to search for: ");
        String target = scanner.nextLine();
        // String target = "pineapple";

        // Taget pineapple
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.println(fruits[i] + " found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("fruit not found in the array");
        }

        // target number 9
        // for(int i = 0; i< numbers.length; i++){
        // if(target == numbers[i]){
        // System.out.println(numbers[i] + " found at index: " + i );
        // isFound = true;
        // break;
        // }
        // }
        // if(!isFound){
        // System.out.println("Element not found in the array");
        // }

        scanner.close();
    }
}
