import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        // accepting user info
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };
        String playAgain = "yes";

        System.out.println("*********************");
        System.out.println("RockPaperScissorsGame");
        System.out.println("**********************");

        do {

            // STEP 1: Get VALID user input (already validated inside method)
            String userChoice = getUserChoice(scanner);
            // STEP 2: Get computer choice
           String computerChoice = getComputerChoice(choices, random);

            System.out.println("***********************");
            System.out.println("USER CHOSE :" + userChoice);

            System.out.println("COMPUTER CHOICE :" + computerChoice);
            System.out.println("***********************");

            //Step 3: decide winner
            determineWinner(userChoice, computerChoice);

            //Play again 
            System.out.println("Play again(yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("THANK-YOU FOR PLAYING");
        scanner.close();
    }

    public static String getUserChoice(Scanner scanner) {
        String userChoice;

        while (true) {
            System.out.println("Enter rock, paper, or scissors:");
            userChoice = scanner.nextLine().toLowerCase().trim();

            if (userChoice.equals("rock") ||
                    userChoice.equals("paper") ||
                    userChoice.equals("scissors")) {
                break;
            }

            System.out.println("Invalid choice. Try again.");
        }

        return userChoice;

    }

    public static String getComputerChoice(String[] choices, Random random) {
        int randomIndex = random.nextInt(choices.length); // random number between 1 to 3 ( 3 is the choices arr length
        // access the choices arr elements via index
        return choices[randomIndex];
    }

    public static void determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            System.out.println("TIE");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("YOU WIN!");
        } else {
            System.out.println("YOU LOSE!");
        }
    }

}
