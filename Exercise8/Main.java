import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // if statements performs a block of codeif its condidtion is true

        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your Name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a student? (true/false) ");
        isStudent = scanner.nextBoolean();

        //Group1 - name
        if(name.isEmpty()){
            System.out.println("You didn't enter your name");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        //Group 2 - ahe
        if (age >= 65) {
            System.out.println("You are a senior!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age < 0) {
            System.out.println("You haven't been brn yet!");
        } else if (age == 0) {
            System.out.println("You are a baby");
        } else {
            System.out.println("You are a child!");
        }

        //Group3
        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}