public class Main {
    public static void main(String[] args) {
        // overloaded constructors = Allow a class to have multiple constructors
        // with different parameter lists.OR
        // Having multiple constructors in the same class with different parameters.
        // Enable objects to be initialized in various ways.
        User user1 = new User(); //default value
        User user2 = new User("Bala");
        User user3 = new User("Patric", "pat123@gmail.com");
        User user4 = new User("Sandy", "sandy45@gmail.com", 45);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }
}