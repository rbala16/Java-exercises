import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        /*
         * ==========================================
         * JAVA DATE & TIME API
         * ==========================================
         *
         * Java provides a modern date-time API in
         * java.time package.
         * How to work with DATES & TIMES using Java
         * (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
         * It replaces old classes like Date and Calendar.
         */

        // Current Date (YYYY-MM-DD)
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // UTC Timestamp (Instant)
        Instant instant = Instant.now();
        System.out.println(instant);

        // Current Time (HH:MM:SS)
        LocalTime time = LocalTime.now();
        System.out.println(time);

        // Current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // ==========================================
        // 5. Custom Formatting
        // ==========================================

        /*
         * DateTimeFormatter allows you to
         * change how date/time is displayed.
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        // Comparing dates & times
        LocalDateTime date1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0); // CHRISTMAS
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0); // NEW YEARS DAY

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier than " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is later than " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is equal to " + date2);
        }
    }
}
