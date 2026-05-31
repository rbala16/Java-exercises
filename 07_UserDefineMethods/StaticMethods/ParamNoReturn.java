public class ParamNoReturn {

    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called ()
     String name = "John";
     int age = 28;
     
     //arguments are actual value passed during method call e.g name and age
        happyBirthday(name,age);  
    }
    //String name and int age is parameters ,we need to set up matching parameters
    // this is inside method definition.It acts like a placeholder variable.you can name it different too
    static void happyBirthday(String name,int age){   
      System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n",name); //format specifier
        System.out.printf("You are %d years old!\n",age);
        System.out.println("Happy Birthday to you!\n");
    }
}


