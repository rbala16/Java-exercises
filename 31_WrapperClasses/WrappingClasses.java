public class WrappingClasses {
    /*
     * Wrapper classes = Allow primitive values (int, char, double, boolean)
     * to be used as objects. "Wrap them in an object"
     * Generally, don't wrap primitives unless you need an object.
     * Allows use of Collections Framework and static utility methods.
     * WRAPPER CLASSES
     *
     * int -> Integer
     * double -> Double
     * char -> Character
     * boolean -> Boolean
     *
     * They allow primitives to be treated as objects.
     */

    public static void main(String[] args) {

        // The constructor Integer(int) is deprecated since version 9
        // Integer a = new Integer(123);
        // Double b = new Double(3.14);
        // Character c = new Character('$');
        // Boolean d = new Boolean(true);

        // AUTBOXING (automatic primitive -> object)
        // Integer a = 123;
        // Double b = 3.14;
        // Character c = '$';
        // Boolean d = true;
        

        // UNBOXING (automatic object -> primitive)
        // int x = a;
        // double y = b;
        // char z = c;
        // boolean h = d;

        // CONVERTING PRIMITIVES TO STRING
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        // String concatenation
        String x = a + b + c + d;

        System.out.print(x);

        /*
         * PARSING
         * Convert String -> Primitive
         */
        int e = Integer.parseInt("123");
        double f = Double.parseDouble("3.14");
        char g = "Pizza".charAt(0);
        boolean h = Boolean.parseBoolean("true");

        // String y = e + f + g + h // can't add diff data types

        //Character utility methods
        char letter = 'b';
        // Checks if character is a letter
        System.out.println(Character.isLetter(letter));
        // Checks if character is uppercase
        System.out.println(Character.isUpperCase(letter));

    }
}