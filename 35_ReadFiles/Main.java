import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
         * FILE READING
         * ------------
         * Used to read data from files.
         *
         * Popular options:
         * BufferedReader + FileReader: Best for reading text files line-by-line
         * FileInputStream: Best for binary files (e.g., images, audio files)
         * RandomAccessFile: Best for read/write specific portions of a large file
         */

        // Location of file to read
        String filePath = "C:\\Users\\username\\Desktop\\test.txt";
        /*
         * FileReader
         * Opens a connection to the file.
         *
         * BufferedReader
         * Reads text efficiently line-by-line.
         */
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));) {
            String line; // Stores one line at a time
            /*
             * Read lines until end of file.
             *
             * readLine() returns:
             * - A String if a line exists
             * - null when EOF (End Of File) is reached
             */
            while ((line = reader.readLine()) != null) {
                // Print current line
                System.out.println(line);
            }
        }
        // Happens when file cannot be found.
        catch (FileNotFoundException e) {
            System.out.println("Couldn't locate file");
        }
        // Handles general file reading errors.
        catch (IOException e) {
            System.out.println("Something went wrong");
        }

    }
}
