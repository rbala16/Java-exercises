public class Book {

    String title;
    int pages;

    // Constructor
    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    String displayBooksInfo() {
        return this.title + " (" + this.pages + " pages)";
    }
}
