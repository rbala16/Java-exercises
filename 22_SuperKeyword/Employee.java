public class Employee extends Person {
    // Employee-specific attribute
    int salary;

    /*
     * Constructor
     * super(first, last) → initializes parent class variables
     */
    Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    /*
     * Employee-specific method
     */
    void showSalary() {
        System.out.println(this.first + "'s salary is $" + this.salary);
    }
}
