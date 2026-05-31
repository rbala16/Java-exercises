import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        
        //create Random number object
        Random random = new Random();

        //with INT
        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1,101); // provide number between 1 to 101 excludimg 101
        number2 = random.nextInt(1,101);
        number3 = random.nextInt(1,101);

        System.out.println("\nlet print whole number random numbers between 1 to 100:");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    
        //WITH DOUBLE 
        double number;
        number = random.nextDouble();

        System.out.println("\nlet print decimal number random numbers between 1 to 100:");
        System.out.println(number);

        //WITH BOOLEAN
        boolean isHeads;

        isHeads = random.nextBoolean();

        System.out.println("\nlets check if its heads or tails?");
        System.out.println(isHeads);

        if(isHeads){
            System.out.println("heads");
        }
        else{
            System.out.println("tails");
        }
    }
}