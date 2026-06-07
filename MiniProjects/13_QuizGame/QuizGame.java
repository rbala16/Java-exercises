import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = { "What keyword is used to define a class in Java?",
                "Which method is the entry point of a Java program?",
                "Which data type is used to store decimal numbers in Java?",
                "Which loop is guaranteed to execute at least once?",
                "Which keyword is used to create an object in Java?"
        };

        String[][] options = { { "A) function", "B) class", "C) struct", " D) define" },
                { "A) start()", "B) main()", "C) run() ", "D) init()" },
                { "A) int", "B) char", "C) double ", "D) boolean" },
                { "A) for loop ", "B) while loop", "C) do-while loop", "D) enhanced for loop" },
                { "A) this", "B) new ", "C) create", "D) object" }
        };

        String[] answers = { "B", "B", "C", "C", "B" };
        int score = 0;
        

        // char answer = scanner.next().charAt(0);

        System.out.println(" ");
        System.out.println("**************************");
        System.out.println("Welcome to Java Quiz Game!");
        System.out.println("**************************");

        // list questions using loop
        for (int i = 0; i < questions.length;i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                 System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            String answer = scanner.next();
            
            if(answer == answers[i]){
                System.out.println("***********");
                System.out.println("**CORRECT**");
                System.out.println("***********");
                score++;
            }
            else{
                System.out.println("***********");
                System.out.println("***WRONG***");
                System.out.println("***********");
            }
        }
        System.out.println();
        System.out.println("Your final score is: " + score + " out of " + questions.length);
        // options //get guess from user //check our guess
        // display final score
        scanner.close();
    }
}