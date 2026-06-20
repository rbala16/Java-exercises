public class Rectangle extends Shape {
    double length;
    double width;

    /*
     * Constructor
     * Initializes rectangle dimensions
     */
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /*
     * IMPLEMENTING ABSTRACT METHOD
     * - We MUST override area() from Shape class
     * - Defines how rectangle calculates area
     */
    @Override
    double area() {
        return length * width;
    }
}
