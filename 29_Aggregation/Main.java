public class Main {
    public static void main(String[] args) {
        /*
         * Aggregation = Represents a "has-a" relationship between objects.
         * One object contains another object as part of its structure,
         * but the contained object/s can exist independently.
         * Aggregation = one object contains reference of another object, but both can
         * exist independently
         * 
         */

        // Creating Book objects
        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        // Store all books inside an array
        Book[] books = { book1, book2, book3 };

        /*
         * Creating Library object
         * Library receives references to existing Book objects
         */
        Library library = new Library("TorontoLibrary", 1985, books);

        library.displayInfo();
    }
}