public class Main {
    public static void main(String[] args) {
        /*
         * ==========================================
         * ANONYMOUS CLASS
         * ==========================================
         * Anonymous class = A class that doesn't have a name. Cannot be reused.
         * Add custom behavior without having to create a new class.
         * It is created and instantiated in a single expression.
         * Often used for one time uses (TimerTask, Runnable, callbacks)
         * 
         * It is useful when:
         * - You only need the class once.
         * - You don't want to create another Java file.
         * - You want to override or customize behavior.
         */

        // Normal Dog object
        Dog dog1 = new Dog();
        // TalkingDog talkingDog = new TalkingDog(); INSTEAD OF CREATING NEW OBJ
        // talkingDog.speak();
        /*
         * Normally, to customize the speak() method,
         * we would create another class:
         *
         * class TalkingDog extends Dog {
         * void speak(){ ... }
         * }
         *
         * Instead, we create an anonymous class.
         */

        // Anonymous Dog object
        // Overrides speak() only for this object.
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("Scooby Doo says *Ruh Roh*");
            }

        };

        dog1.speak();
        dog2.speak();

    }
}
