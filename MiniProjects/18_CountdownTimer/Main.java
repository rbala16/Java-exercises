import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        /*
         * ==========================================
         * JAVA COUNTDOWN TIMER PROGRAM
         * ==========================================
         *
         * Program:
         * 1. Ask user for starting seconds.
         * 2. Count down every second.
         * 3. Print each number.
         * 4. When countdown reaches -1,
         * display "HAPPY NEW YEAR".
         *
         * Concepts:
         * - Scanner (user input)
         * - Timer (schedule repeated tasks)
         * - TimerTask (task to execute)
         * - Anonymous Class (custom TimerTask)
         */

        // Get countdown starting value from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of secs to countDown from:");
        int response = scanner.nextInt();

        // Create Timer object
        // Timer controls when the task runs.
        Timer timer = new Timer();
        // Create TimerTask
        // Anonymous class because we only need this task once
        TimerTask task = new TimerTask() {

            // Store the current countdown value
            int count = response;

            /*
             * run() executes every time the timer runs.
             * This method is automatically called by Timer.
             */
            @Override
            public void run() {
                System.out.println(count);
                count--;
                // When countdown finishes
                if (count < 0) {
                    System.out.println("HAPPY NEW YEAR");
                    timer.cancel(); // stop the timer
                }
            }
        };
        /*
         * scheduleAtFixedRate()
         *
         * Runs a task repeatedly at a fixed interval.
         *
         * Parameters:
         *
         * task → What code should run
         * 0 → Start immediately
         * 1000 → Repeat every 1000 milliseconds
         * (1 second)
         */
        timer.scheduleAtFixedRate(task, 0, 1000);

        
    }
}