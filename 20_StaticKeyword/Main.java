public class Main {
    public static void main(String[] args) {
        /* 
        * static = Modifies a variable or method belong to the class,
        * rather than to any specific object.
        * Belongs to the CLASS, not to an object
        * shared across all objects
        * Commonly used for utility methods or shared resources.
           */

        // Creating Friend objects
        Friend friend1 = new Friend("Bala");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Sandy");
        Friend friend4 = new Friend("Mandy");
        Friend friend5 = new Friend("Garry");

        // System.out.println(friend1.numOfFriends);  //4
        // System.out.println(friend2.numOfFriends);   //4

         /*
         * Even though we created 5 objects,
         * numOfFriends is shared across all objects
         * so it becomes 5 total
         */

        // Accessing static variable using class name 
        // System.out.println(Friend.numOfFriends);
        
          /*
         * Calling static method using class name
         * No need to create object
         */
        Friend.showFriends();
        


    }
}