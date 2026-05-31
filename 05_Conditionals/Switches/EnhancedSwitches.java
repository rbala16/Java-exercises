import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {

        /*
         * Enhanced switch = A replacement to many else if statements
         * (Java14 feature)
         * A switch statement in Java is a way to choose between many possible values
         * without writing lots of if-else statements.
         * 
         * It is used when one variable has many fixed options (like day, grade, menu
         * choice, etc.)
          Switch = menu system
          If-else = condition system
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        // if (day.equals("Monday")) {
        //     System.out.println("It is a weekday");
        // } else if (day.equals("Tuesday")) {
        //     System.out.println("It is a weekday ");
        // } else if (day.equals("Wednesday")) {
        //     System.out.println("It is a weekday ");
        // } else if (day.equals("Thursday")) {
        //     System.out.println("It is a weekday ");
        // } else if (day.equals("Friday")) {
        //     System.out.println("It is a weekday ");
        // } else if (day.equals("Saturday")) {
        //     System.out.println("It is the weekend ");
        // } else if (day.equals("Sunday")) {
        //     System.out.println("It is the weekend ");
        // } else {
        //     System.out.println(day + " is not a valid day");
        // }

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday ");
            case "Saturday", "Sunday" ->
                    System.out.println("It is the weekend ");
            default -> System.out.println(day + " is not a day");
        }

        scanner.close();
    }
}
