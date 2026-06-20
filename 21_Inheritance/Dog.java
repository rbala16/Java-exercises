public class Dog extends Animal {
    // Dog-specific property
    int lives = 1;

    /*
     * Dog-specific method
     * This overrides/defines behavior for Dog
     */
    void speak() {
        System.out.println("The dog goes *woof");
    }
}
