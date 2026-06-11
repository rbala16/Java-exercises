public class Student {

    // CLASS VARIABLES (these belong to the object)
    String name = "Bala"; // default value (will be overwritten by constructor)
    int age;
    double gpa;
    boolean isEnrolled;

    // CONSTRUCTOR ⭐
    // Runs automatically when object is created
    // Constructor fills object values using parameters, and 'this' refers to the
    // object being created.
    Student(String name, int age, double gpa) {
        // 'this' refers to CURRENT OBJECT (student1 or student2)
        // this = the object that is currently using the method or constructor
        this.name = name; // object.name = parameter name
        this.age = age; // object.age = parameter age
        this.gpa = gpa; // object.gpa = parameter gpa
        this.isEnrolled = true;
    }

    //Class methods
    void study(){
        System.out.println(this.name + " is Studying");
    }
}
