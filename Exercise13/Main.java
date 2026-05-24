public class Main {

    public static void main(String[] args) {
        // printf() is a method used to format output
        //System.out.printf("format", values);
        // % [flags] [width] [.precision] [specifier-character]

        /***** [specifier-character] ***********/

        // String name = "RobertBobb";
        // char firstLetter = 'R';
        // int age = 30;
        // double height = 60.5;
        // boolean isEmployed = true;

        // System.out.printf("Hello %s\n", name);
        // System.out.printf("Your name starts with a %c\n", firstLetter);
        // System.out.printf("You are %d years old\n", age);
        // System.out.printf("You are %f inches tall\n", height);
        // System.out.printf("Employed: %b\n", isEmployed);

        // System.out.printf("%s is %d years old",name,age);

        /************** [.precision] ***************/

        // double price1 = 8.90;
        // double price2 = 10.15;
        // double price3 = -50.01;

        // System.out.printf("%.3f\n", price1);
        // System.out.printf("%.3f\n", price2);
        // System.out.printf("%.3f\n", price3);

        /*****************************
         * [flags]
         * 
         * + = output a plus
         * , = comma grouping separator
         * ( = negative numbers are enclosed in ()
         * space = display a minus if negative, space if positive
         */

        // double price = 8.29;
        // double price1 = 9.69;
        // double price2 = 99.15;
        // double price3 = -55.01;
        // double price4 = -2230.04;
        // double price5 = 5700.89;
        // System.out.printf("% .1f\n",price);
        // System.out.printf("%.1f\n",price1);// %f display 6 digit after decimal
        // System.out.printf("%+.2f\n",price2);
        // System.out.printf("%.3f\n",price3);
        // System.out.printf("%(,.3f\n",price4);
        // System.out.printf("%(+,.3f\n",price5);

        /**************************
         * [width]
         * 
         * 0 = zero padding
         * number = right justified padding
         * negative number = left justified padding
         */
        int id1 = 1;
        int id2 = 13;
        int id3 = 256;
        int id4 = 5890;
        int id5 = 68906;
        int id6 = 789068;
        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);
        System.out.printf("%-4d\n",id5);
        System.out.printf("%-4d\n",id6);
    }
}