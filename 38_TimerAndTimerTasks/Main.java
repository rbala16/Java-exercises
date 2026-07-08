import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        /*
         * ==========================================
         * TIMER & TIMERTASK
         * ==========================================
         * Timer = Class that schedules tasks at specific times or periodically
         * Schedules tasks to run later or repeatedly.
         * Useful for: sending notifications, scheduled updates, repetitive actions
         * 
         * TimerTask = Represents the task that will be executed by the Timer
         * You will extend the TimerTask class to define your task
         * Create a subclass of TimerTask and @Override run()
         */

        // Create a Timer object
        Timer timer = new Timer();
        // Create an anonymous TimerTask object.
        TimerTask task = new TimerTask() {
            // Counts how many executions remain
            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello!");
                count--;
                // Stop the timer after 3 executions
                if (count <= 0) {
                    System.out.println("Task completed!");
                    // Cancel the timer and stop scheduling
                    timer.cancel();
                }
            }
        };
        /*
         * schedule(task, delay, period)
         *
         * task -> Task to execute
         * delay -> Wait before first execution (milliseconds)
         * period -> Time between executions (milliseconds)
         */

        timer.schedule(task, 3000, 1000);
        
    }
}