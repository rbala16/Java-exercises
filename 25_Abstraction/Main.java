public class Main {
    public static void main(String[] args) {
        /*
         * abstract = Used to define abstract classes and methods.
         * Abstraction is the process of hiding implementation details
         * and showing only the essential features.
         * Hiding unnecessary details and showing only the essential features
         * Abstract classes CAN'T be instantiated directly.
         * Can contain 'abstract' methods (which must be implemented)
         * Can contain 'concrete' methods (which are inherited)
         */

        // since shape is an abstract class we can't create any objects from this class
        // IMPORTANT RULE:
        // You CANNOT create object of abstract class
        // Shape shape = new Shape(); //not allowed

        // Creating objects of concrete subclasses
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(6, 7);
        Rectangle rectangle = new Rectangle(8, 9);

        /*
         * display() comes from abstract parent class (Shape)
         * area() is implemented differently in each class
         */
        circle.display();
        triangle.display();
        rectangle.display();

        // Calling overridden area methods
        System.out.println("Area of circle is: " + circle.area());
        System.out.println("Area of Triangle is: " + triangle.area());
        System.out.println("Area of rectangle is: " + rectangle.area());
    }
}