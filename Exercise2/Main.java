import java.nio.channels.Pipe.SourceChannel;

public class Main {
    
    public static void main(String[] args) {
        /* 
        ❎ variable = A reusable container for a value.
                                A variable behaves as if it was the value it contains.

        🟥 Primitive = simple value stored directly in memory (location:stack)
        🟦 Reference = memory address (stack) that points to the (heap)

        🟥 Primitive            vs    🟦 Reference(sequences of chracters)
            ---------                      ---------
            int                           string("")
            double                        array
            char ('')                     object
            boolean
          */

        /*  Steps to create a variable
         -----------------------------------
         1. declaration 
         2. assignment
        */
        // int age ;
        // age = 25;

        // WHOLE NUMBERS
        int age = 21;
        int year = 2026;
        // int quantity = 2;

        // DECIMAL NUMBER
        double price = 29.99;
        double gpa = 9.5;
        // double temperature = -13.5;
        
        //SINGLE CHARACTER
        char grade = 'A';
        // char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = true;
        // boolean isOnline = false;

        // String name = "Rajni";
        // String food = "Burger";
        // String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";
       
         System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }

        if(isStudent){
            System.out.println("You are a student " + "You age is " + age + " you received grade: " + grade + " and gpa " + gpa);
        }
        else{
            System.out.println("You are not a student");
        }

        String name = "Rajni";
        int gta = 6;
        double pi = 3.14159;
        char gender = 'F';
        boolean isAdmin= true;
        
        System.out.println("My name is " + name + "gender: " + gender);
        System.out.println("The value of pi is: " + pi);
        if(isAdmin){
            System.out.println("You are a Admin");
        }
        else{
            System.out.println("You are not a Admin");
        }
        System.out.println(gta);
    }
}
