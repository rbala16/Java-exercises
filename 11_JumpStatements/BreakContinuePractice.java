public class BreakContinuePractice {

    public static void main(String[] args) {
        // break = break out of a loop (STOP)- exit the loop
        // continue = skip current iteration of a loop (SKIP)- SKIP current iteration

        //once consition becomes true , exit out of loop completely
        System.out.println("Break : ");
        for(int i = 0; i < 10;i++){
            if (i == 5) {
                break;
            }
         System.out.print(i + " ");
        }
       // Skip the iteration 5 and Continue to the next loop cycle
        System.out.println("\nContinue : ");
        for(int i = 0; i < 10;i++){
            if (i == 5) {
                continue;
            }
         System.out.print(i + " ");
        }
    }
}