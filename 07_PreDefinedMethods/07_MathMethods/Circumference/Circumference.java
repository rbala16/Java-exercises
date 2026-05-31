import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        // circumference = 2 * Math.PI * radius;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the raduis: ");
    double radius = scanner.nextDouble();

    double  circumference = 2 * Math.PI * radius;
     System.out.printf("The circumference is: %.1fcm", circumference);

    scanner.close();
    }
}
