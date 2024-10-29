import java.util.ArrayList;

public class Book_Main {
    public static void main(String[] args) {

        Book book1 = new Book("It Ends with us", "Colleen Hoover");
        Book book2 = new Book("Shadow and Bone", "Leigh Bardugo");

        System.out.println("Book1 title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Book2 Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        //Array books [], and add book1 and book2
        Book[] books = {book1, book2};
//print out books in array books[]
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
        System.out.println("--------------------------------");
        //print out the title of each book inside array books[]
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
//--------------------------------------------------------------------------------
        //ArrayList

        Book book3 = new Book("pride and prejudice", "Jane Austen");
        Book book4 = new Book("Hamlet", "William Shakespeare");
//creating an ArrayList of type Book
        ArrayList<Book> Books = new ArrayList<Book>();
        System.out.println("----------------------------------");
        //adding books 1-4 inside ArrayList Books
        Books.add(book1);
        Books.add(book2);
        Books.add(book3);
        Books.add(book4);
//print out all books in ArrayList Books
        for (Book book : Books) {
            System.out.println(book.toString());
        }
        System.out.println("------------------------------------");

        System.out.println(Books.get(0));


//creating some new books
        Book book5 = new Book("Hamlet", "William Shakespeare");
        Book book6 = new Book("Harry Potter", "JK Rowling");
        Book book7 = new Book("Shadow hunter", "unknown");
        //creating an array of four
        Book[] books1 = new Book[4];
        //initializing the array of type Book,
        books1[0] = book5;
        books1[1] = book6;
        books1[2] = book7;
        //print out the books in book
        for (int i = 0; i < books1.length; i++) {
            System.out.println(books1[i].toString());
        }


    }
}