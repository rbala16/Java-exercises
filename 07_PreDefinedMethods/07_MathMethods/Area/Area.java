import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        
    // area = Math.PI * Math.pow(radius, 2);
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the raduis: ");
    double radius = scanner.nextDouble();

    double area = Math.PI * Math.pow(radius, 2) ;
    /* using printf method to format string: 
    %.1f 
    % → placeholder for a number
     .1 → show 1 digit after decimal
     f → floating point number (float/double)*/
     System.out.printf("The area is: %.1fcm²", area);
    scanner.close();

    }
}
