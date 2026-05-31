import java.util.Scanner;

public class ValidUserName {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //username must be between 4-12 characters
        //username must not contain spaces or underscores

        String username ;
        boolean isValid = true;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 ||  username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
             isValid = false;
        }
       if(username.contains(" ") || username.contains("_")){
        System.out.println("Username must not contain spaces or underscores");
         isValid = false;
        }
        if (isValid) {
        System.out.println("Your username is: " + username);
        }
        


        scanner.close();
    }
}
