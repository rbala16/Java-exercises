public class MethodOverloadingPractice {
    public static void main(String[] args) {

        String pizza = bakePizza("flat bread", "mozzarella","vege");
        System.out.println(pizza);

    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese , String type) {
        return type + " "+ cheese + " " + bread + " pizza";
    }
}
// Output : vege mozzarella flat bread pizza