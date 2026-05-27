import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        
        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            double weightInlbs = scanner.nextDouble();
            double newWeightlbs = weightInlbs*0.453592;
            System.out.printf("The new weight in kgs is %.2f",newWeightlbs);

        }
        else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            double weightInKgs = scanner.nextDouble();
            double newWeightKgs = weightInKgs * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f",newWeightKgs );
        }
        else{
            System.out.println("That was not a valid choice");
        }

        scanner.close();
    }
}