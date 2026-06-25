import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
         * FILE WRITING
         * ------------
         * Used to create or write data to a file.
         *
         * Popular ways to write files:
         * FileWriter = Good for small or medium-sized text files
         * BufferedWriter = Better performance for large amounts of text
         * PrintWriter = Best for structured data, like reports or logs
         * FileOutputStream = Best for binary files (e.g., images, audio files)
         */
        // File name or path where data will be written
        String filePath = "test.txt";
        // Example of an absolute path
        // String filePath = "C:\\Users\\username\\Desktop\\test.txt"; //wromg location

        // Multi-line String stored in a variable.
        String textContent = """
                Roses are Red
                Violets are Blue
                BOOTY BOOTY BOOTY
                ROCKIN' EVERWHERE!
                """;

        /*
         * try-with-resources
         *
         * Automatically closes FileWriter
         * after the try block finishes.
         */
        try (FileWriter writer = new FileWriter(filePath)) {
            // Write text into the file
            writer.write(textContent);
            System.out.println("File has been written");
        }
        // Happens if file location cannot be found.
        catch (FileNotFoundException e) {
            System.out.println("Couldn't locate file location");
        }
        // Handles general file writing errors.
        catch (IOException e) {
            // TO DO: handle exception
            System.out.println("Could not write file");
        }

    }
}