import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {
        
        //HYPOTENUSE c = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side A: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.print("The hypotenuse (side c) is: " + c + "cm");

        scanner.close();
    }
}