public class Rabbit implements Prey {
    /*
     * MUST implement flee() because Rabbit is a Prey
     */
    @Override
    public void flee() {
        System.out.println("The rabbit is running away");
    }
}