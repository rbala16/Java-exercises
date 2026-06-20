public class Engine {
    String type;

    //constructor
    Engine(String type) {
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type + " engine.");
    }
}
