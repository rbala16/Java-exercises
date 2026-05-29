import java.util.Scanner;

public class StudentGradeSystem{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numOfSubject;
        int marks;
        int totalMarks;
        double average;
        char grade;

        System.out.print("Enter number of subjects: ");
        numOfSubject = scanner.nextInt();

        System.out.print("Enter the marks for each subject: ");
        marks = scanner.nextInt();

        System.out.println("Total marks: ");
        totalMarks = scanner.nextInt();

        System.out.println("Average: ");
        average = scanner.nextDouble();

        System.out.println("Grade: ");
        grade = scanner.next().charAt(0);

        
    }
}