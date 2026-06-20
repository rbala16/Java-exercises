public abstract class Shape {
    /*
     * ABSTRACT METHOD:
     * - No body (no implementation)
     * - Must be implemented by child classes
     * - Forces each shape to define its own area logic
     */
    abstract double area(); // ABSTRACT
    /*
     * CONCRETE METHOD:
     * - Has implementation (normal method)
     * - Inherited by all child classes
     * - Can be used directly without overriding
     */

    void display() { // CONCRETE
        System.out.println("This is a shape");
    }
}
