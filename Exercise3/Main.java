import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        //Create the Scanner obj;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your firstName: ");
        // allow user to type in their name;
        String firstName = scanner.nextLine(); // read entire line
        
        // System.out.print("Enter your SecondName: ");
        // String secondName = scanner.next(); // only read one word 
        // System.out.println("My name is " + secondName);

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("What is your gpa");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student?");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("My name is " + firstName);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        //  System.out.println("Student: " + isStudent);
        
        if(isStudent){
        System.out.println("You are enrolled as a Student");
        }
        else{
            System.out.println("You are not enrolled as a Student");
        }
        scanner.close();

    }
}
