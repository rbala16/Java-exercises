public class Library {
    
    String name;
    int year;
     /*
     * Aggregation:
     * Library stores references to Book objects
     */
    Book[] books;

    //Constructor
   Library(String name,int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
   }

   void displayInfo(){
      System.out.println("This " + this.year + " " + this.name);
      System.out.println("Books Available : ");
      //Loop through each Book object
      for(Book book : books){
            System.out.println(book.displayBooksInfo());
        }

   }
}
