public class Main {
    public static void main(String[] args) {
        /*
         * SUPER KEYWORD = Refers to the parent class (subclass <- superclass)
         * Used in constructors and method overriding
         * Calls the parent constructor to initialize attributes
         * Helps initialize shared attributes
         * Person(Parent)-> Student(child)-> Employee(child)
         */

        // Creating objects
        Person person = new Person("Bala", "Code");
        Student student = new Student("Mandy", "Kaur", 3.5);
        Employee employee = new Employee("Patricia", "Hagrid", 50000);

        // Parent method
        person.showName();
        // Child inherits and uses parent method
        student.showName();
        // Child inherits and uses parent method
        employee.showName();
        // Accessing student-specific data
        System.out.println(student.gpa);
        student.showGPA();
        // Accessing student-specific data
        employee.showSalary();
    }
}