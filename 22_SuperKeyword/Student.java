public class Student extends Person {
    // Student-specific attribute

    double gpa;

    /*
     * Constructor
     * super(first, last) calls parent (Person) constructor
     * so first and last name are initialized in Person class
     */
    Student(String first, String last, double gpa) {
        super(first, last); // calls Person constructor
        this.gpa = gpa;
    }

    /*
     * Student-specific method
     */
    void showGPA() {
        System.out.println(this.first + "'s gpa is :" + gpa);
    }
}
