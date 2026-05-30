import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfSubject;
        int marks;
        int totalMarks = 0;
        double average;
        char grade;

        System.out.print("Enter number of subjects: ");
        numOfSubject = scanner.nextInt();

        for (int i = 1; i <= numOfSubject; i++) {
            System.out.print("Enter the marks for subject" + i + " :");
            marks = scanner.nextInt();
            totalMarks += marks;
        }

        System.out.println("Total marks: " + totalMarks);

        average = calculateAvg(totalMarks, numOfSubject);
        

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'D';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }

    static double calculateAvg(int totalMarks, int numofSubject){
                double average = (double)totalMarks/numofSubject;  //(double) is called type casting
                      System.out.println("Average: " + average);
                      return average;


        }
}