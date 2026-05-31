import java.util.Scanner;

public class ScannerInputPractice{
    
    public static void main(String[] args) {
        //Common issues resolve

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt(); // scanner buffer doesnot read newLine
        scanner.nextLine(); // USE nextLine() to clean up before nextLine() ;

        System.out.println("Enter your favourite color");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color: " + color);

        scanner.close();
    }
}