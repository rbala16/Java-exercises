import java.util.Scanner;

public class SubStrings {

  public static void main(String[] args) {
    // .substring() = A method used to extract a portion of a string
    // .substring(start, end)

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your email: ");
    String email = scanner.nextLine();

    //check to make sure email contain @ 
    if(email.contains("@")){

    // String username = email.substring(0,6); //2nd index is exclusive
    String username = email.substring(0, email.indexOf("@"));
    // if you want all the character from starting index to end , you don't need to
    // mention end index
    // String domain = email.substring(7);
    String domain = email.substring(email.indexOf("@") + 1);

    System.out.println(username);
    System.out.println(domain);
    }

    else{
      System.out.println("Email must contain @");
    }
    scanner.close();

  }
}