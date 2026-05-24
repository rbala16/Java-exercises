import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        
        //COMPOUND INTEREST CALCULATOR

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal ammount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate ( in % ): ");
        double interestRate = scanner.nextDouble()/100;

        System.out.print("Enter number of times compounded per year: ");
        int compoundsPerYear = scanner.nextInt();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double amount = principalAmount *
                       Math.pow(( 1 + interestRate / compoundsPerYear),
                       compoundsPerYear * years);

        System.out.printf("The amount after %d years is: %.2f ",years,amount);;

        scanner.close();
        
    }
}