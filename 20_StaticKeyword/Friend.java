public class Friend {
    // class variable (each object has its own name)
    String name;
    /*
     * STATIC VARIABLE
     * Shared by ALL objects of this class
     * Belongs to the CLASS, not individual objects
     */
    static int numOfFriends;

    /*
     * Constructor
     * Runs every time a new Friend object is created
     */
    Friend(String name) {
        this.name = name; // assign name to current object
        numOfFriends++; // increase shared counter
    }

    /*
     * STATIC METHOD
     * Belongs to the class, not objects
     * Can be called using Friend.showFriends()
     */
    static void showFriends() {
        System.out.println("You have " + numOfFriends + " total Friends");
    }
}
