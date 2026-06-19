public class Fish implements Prey, Predator {
    /*
     * Fish implements TWO interfaces:
     * - Prey → flee()
     * - Predator → hunt()
     */
    @Override
    public void flee() {
        System.out.println("the fish is swimming away");
    }

    @Override
    public void hunt() {
        System.out.println("the fish is hunting");
    }
}
