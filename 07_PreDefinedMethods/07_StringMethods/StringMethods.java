public class StringMethods {

    public static void main(String[] args) {
        
        //STRING METHODS
        String name = "  Bala Code  ";

        int length = name.length(); //length of character imcluding space
        char letter = name.charAt(1); //character at the imdex
        int index = name.indexOf("o");  //index at o character
        int lastIndex = name.lastIndexOf("a"); //last index of a

        name = name.toLowerCase() ;// convert to lowercase
        name = name.toUpperCase(); // convert to uppercase
        name = name.trim();  //remove white spaces before and after the text
        name = name.replace("a", "r"); //replace l with r
        name = name.replace("r", "a");


        System.out.println(length);
        System.out.println(letter);
        System.out.println(index); 
        System.out.println(lastIndex);
        System.out.println(name);

        // isEmpty()
        if(name.isEmpty()){
            System.out.println("Your name is Empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        //contains()
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name doeesn't contain any spaces");
        }
        
        //equals()- Doesnot ignore case senstivity
        if(name.equals("BALA CODE")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }

        // equalIgnoreCase - to ignore case senstibity
        if(name.equalsIgnoreCase("BALA CODE")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }


    }
}