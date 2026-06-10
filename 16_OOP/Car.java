public class Car {

    String make  = "Hyundia";
    String model = "Elentra";
    int year = 2019;
    double price = 35000;
    boolean isRunning = false;

    //CAR METHODS
    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You brake the " + model);
    }
        
    }
