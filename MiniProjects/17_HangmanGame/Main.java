import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * ==========================================
         * JAVA HANGMAN GAME
         * ------------------------------------------
         * 1. Read words from a text file.
         * 2. Randomly choose one word.
         * 3. Hide the word using underscores (_).
         * 4. Let the player guess one letter at a time.
         * 5. Reveal correct letters.
         * 6. Draw the hangman after each wrong guess.
         * 7. Player wins by guessing the word or
         * loses after 6 incorrect guesses.
         * ==========================================
         */

        // ==========================================
        // 1. Read all words from the text file
        // ==========================================

        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line until the end of the file
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not file file");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

        // ==========================================
        // 2. Randomly choose one word from the list
        // ==========================================
        Random random = new Random();
        // Pick one random word from the ArrayList
        String word = words.get(random.nextInt(words.size()));
        // Scanner is used to read guesses from the player
        Scanner scanner = new Scanner(System.in);
        // Stores the hidden word
        // Example: _ _ _ _ _
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0; // Counts incorrect guesses

        // ==========================================
        // 3. Create the hidden word
        // Example:
        // APPLE
        // ↓
        // _ _ _ _ _
        // ==========================================
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');

        }
        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        // ==========================================
        // 4. Main Game Loop
        // Continue until the player reaches
        // 6 incorrect guesses.
        // ==========================================
        while (wrongGuesses < 6) {
            // Draw the current hangman
            System.out.print(getHangmanArt(wrongGuesses));
            // Display the hidden word
            System.out.println("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();
            // Ask the player to guess one letter
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            // ======================================
            // 5. Check whether the guessed letter
            // exists in the selected word.
            // ======================================

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!");
                // Reveal every matching letter
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }
                // ==================================
                // Check if the player has guessed
                // every letter.
                // ==================================
                if (!wordState.contains('_')) {
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!!");
                    System.out.println("The word was : " + word);
                    break;
                }

            }
            // ======================================
            // 6. Incorrect Guess
            // Increase wrong guess counter.
            // ======================================
            else {
                wrongGuesses++;
                System.out.println("Wromg guess");
            }
        }
        // ==========================================
        // 7. Player loses after six wrong guesses
        // ==========================================
        if (wrongGuesses >= 6) {
            System.out.print(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }

        scanner.close();
    }

    /*
      ==========================================
      Returns the Hangman drawing based on the
      number of incorrect guesses.
      ==========================================
     */
    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> """
                      """;
            case 1 -> """
                     o


                    """;
            case 2 -> """
                     o
                     |

                    """;
            case 3 -> """
                     o
                    /|

                    """;
            case 4 -> """
                     o
                    /|\\

                    """;
            case 5 -> """
                     o
                    /|\\
                    /
                    """;
            case 6 -> """
                     o
                    /|\\
                    / \\
                    """;
            default -> "";
        };
    }
}