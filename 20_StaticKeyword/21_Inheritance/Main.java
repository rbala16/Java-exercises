public class Main {
    public static void main(String[] args) {
        /*
         * Inheritance = One class inherits the attributes and methods or
         * One class acquires properties and methods of another class
         * Inheritance = reusing code from another class
         * Child classes reuse properties/methods of parent class
         * No need to rewrite common code again and again
         * Child <- Parent <- Grandparent
         * Organism(Parents of everything)-> Animal & Plant(child of Orangism)
         * -> Animal(child of Organism)-> Dog & Cat(Child of Animal)
         * -> Plant(child of Organism)->
         */

        // Creating objects
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        // Accessing inherited property from Organism
        System.out.println(dog.isAlive); // true (from Organism)
        System.out.println(cat.isAlive); // true (from Organism)
        System.out.println(plant.isAlive); // true (from Organism)
        // Accessing Dog-specific property
        System.out.println(dog.lives);
        // Dog method
        dog.speak();
        // Accessing Cat-specific property
        System.out.println(cat.lives);
        // Cat Method
        cat.speak();
        // plant method
        plant.photosynthesize();

    }
}