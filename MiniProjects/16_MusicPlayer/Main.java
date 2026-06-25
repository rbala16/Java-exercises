import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) {
         /*
         * AUDIO PLAYER PROGRAM
         * --------------------
         * This program allows:
         * - Play audio
         * - Stop audio
         * - Reset audio
         * - Quit program
         *
         * Uses Java Sound API
         */

         // Path of audio file
        String filePath = "Never Change (feat. The Parrisian & Parris Fleming) - The Parrisian feat. Parris Fleming.wav";

         // File object pointing to audio file
        File file = new File(filePath);

         /*
         * try-with-resources:
         * - Scanner for user input
         * - AudioInputStream for reading audio file
         *
         * Both will be automatically closed
         */
        try (Scanner scanner = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
              // Clip = controls audio playback
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = " ";
             /*
             * Menu loop:
             * Runs until user presses Q
             */
            while (!response.equals("Q")) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");
                
                 // Convert input to uppercase for consistency
                response = scanner.next().toUpperCase();
                // Switch controls audio actions
                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }

            System.out.println("No problems detected");
        } 
        //File not found error
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        } 
        //Audio device error
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        } 
        //Unsupported audio format (not WAV, etc.)
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supporting");
        } 
        //General input/output error
        catch (IOException e) {
            System.out.println("Something Went wrong");
        } 
        // Always runs at the end
        finally {
            System.out.println("BYE!!");

        }

    }
}