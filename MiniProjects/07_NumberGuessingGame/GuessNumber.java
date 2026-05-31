import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        // NUMBER GUESSING GAME
        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100; //max represents the actual maximum number you want

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        //max+1 , max ending value will be excluded so thatswhy max + 1 , so max value we want is 10
        int randomNumber = random.nextInt(min, max + 1); // random number between 1 to 10

        System.out.println("*** Number guessing game: ***");
        System.out.printf("Guess a number between %d - %d:\n ",min,max); // %d placedolder for integers and this is print formatted text 

        do {
            System.out.print("Enter a guess number: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW, TRY AGAIN!!");
            }
            else if (guess > randomNumber) {
                System.out.println("TOO HIGH, TRY AGAIN!!");
            }
            else{
                System.out.println("You won , yaay , The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }

        } while (guess != randomNumber);

        

        scanner.close();
    }
}