public class Person {
    // Common attributes for all persons
    String first;
    String last;

    /*
     * Constructor
     * Initializes first name and last name
     */
    Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    /*
     * Method to display full name
     * Shared by all child classes (Student, Employee)
     */
    void showName() {
        System.out.println(this.first + " " + this.last);
    }
}
