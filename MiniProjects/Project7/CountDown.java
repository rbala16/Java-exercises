import java.util.Scanner;

public class CountDown {

    public static void main(String[] args) throws InterruptedException {
      /*   this exception typically occurs when a thread running the method is
        interrupted
        while it is sleeping,waiting, or otherwise pause in its execution OR
        If someone interrupts sleep → Java error may happen
        It’s about threads being interrupted by Java system or other threads.
        FLOW : Print number → wait 1 sec → print next number → wait → repeat */
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many seconds you want to countdown from?: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            /* Pause the program for 1000 milliseconds (1 second)
            Pause the program for 1000 milliseconds (1 second)
            */
            Thread.sleep(1000); 
        }
        System.out.println("Happy new year!!");
        scanner.close();
    }
}