public class Car {
    /*
     * PRIVATE VARIABLES:
     * - Cannot be accessed directly from outside class
     * - Protects data integrity
     */
    private final String model; // cannot be changed after creation
    private String color;
    private int price;

    /*
     * Constructor:
     * Initializes object values
     */
    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    /*
     * GETTERS → READ ACCESS
     */

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    String getPrice() {
        return "$" + this.price;
    }

    /*
     * SETTERS → WRITE ACCESS
     * Used to control how data is modified
     */
    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price can't be less than zero");
        } else {
            this.price = price;
        }
    }

}
