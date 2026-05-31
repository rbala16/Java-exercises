import java.util.Scanner;

public class Volume {

    public static void main(String[] args) {
               // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the raduis: ");
    double radius = scanner.nextDouble();

    double  volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
     System.out.printf("The volume is: %.1fcm³\n", volume);

    scanner.close();
    }
}