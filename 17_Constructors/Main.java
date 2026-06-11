public class Main {
    public static void main(String[] args) {

        // constructor = A special method to initialize objects
        // When an object is created using new, the constructor runs automatically.
        // You can pass arguments to a constructor
        // and set up initial values

        // OBJECT 1 ⭐
        // new Student(...) calls constructor automatically
        Student student1 = new Student("John", 30, 3.2);
        Student student2 = new Student("Patricia", 34, 1.5);
        Student student3 = new Student("Sandy", 27, 4.0);

        // PRINTING VALUES OF OBJECT 1
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        //call the study method
        student1.study();
        // PRINTING VALUES OF OBJECT 2
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();
         // PRINTING VALUES OF OBJECT 3
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();

    }
}
