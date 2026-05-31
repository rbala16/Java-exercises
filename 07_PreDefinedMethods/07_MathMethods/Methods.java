public class Methods {
    public static void main(String[] args) {

        // Math.PI is a built-in Java constant for the value of π (pi).
        System.out.println(Math.PI);
        // Math.E in Java is a constant representing Euler’s number:
        System.out.println(Math.E);

        // power of 2 is 3
        double powerResult = Math.pow(2, 3);
        System.out.println(powerResult);

        /*
         * Math.abs() in Java returns the absolute value of a number.
         * Absolute value means:
         * distance from 0
         * negative becomes positive
         */
        double absoluteValue = Math.abs(-5);
        System.out.println(absoluteValue);

        // square root
        double squareRoot = Math.sqrt(9);
        System.out.println(squareRoot);

        // round method
        double roundedValue = Math.round(3.14);
        System.out.println(roundedValue);

        // ceiling method- round up to 4
        double ceilingValue = Math.ceil(3.14);
        System.out.println(ceilingValue);

        // floor method to rounded down
        double roundedDown = Math.floor(3.99);
        System.out.println(roundedDown);

        //max between two value
        double maxNumber = Math.max(10, 20);
        System.out.println(maxNumber);

        //min between two value
        double minNumber = Math.min(10, 20);
        System.out.println(minNumber);
    }
}
