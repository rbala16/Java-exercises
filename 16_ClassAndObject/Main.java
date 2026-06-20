
public class Main {

    public static void main(String[] args) {
        // Object = An entity that holds data (attributes)
        // and can perform actions (methods)
        // It is a reference data type

        // Scanner scanner = new Scanner(System.in);
        // Random random = new Random();

        // create car object
        Car car = new Car();

        //change the attribute
        // car.isRunning = true;

        //access car attributes
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
        System.out.println();

        //calling the car method
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        car.drive();
        car.brake();

        Car car1 =new Car();
        Car car2 = new Car();
        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);
    }
}