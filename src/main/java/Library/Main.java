package Library;

import java.util.Scanner;

public class Main {

    static Library library = new Library();

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        library.addBook("Brave New World", "Aldous Huxley", "123-234", true, "");
        library.addBook("Great Expectations", "Charles Dickens", "234-345", true, "");
        library.addBook("Hamlet", "William Shakespeare", "345-456", true, "");
        library.addBook("Heart Of Darkness", "Joseph Conrad", "456-567", true, "");
        library.addBook("Jane Eyre", "Charlotte Bronte", "567-678", true, "");
        library.addBook("Macbeth", "William Shakespeare", "678-789", true, "");
        library.addBook("Pride And Prejudice", "Jane Austen", "789-890", true, "");
        library.addBook("The Good Earth", "Pearl S. Buck", "890-901", true, "");
        library.addBook("The Scarlett Letter", "Nathaniel Hawthorne", "901-012", true, "");
        library.addBook("Treasure Island", "Robert Louis Stevenson", "012-123", true, "");

        process();
    }

    public static void process() {
        System.out.println("* * * Welcome to Sky Library * * * ");
        System.out.println();
        library.showAllBooks();
        System.out.println();

        System.out.print("Do you want to 'borrow' a book or 'return'?: ");
        String dec = scan.nextLine();

        if(dec.equalsIgnoreCase("borrow")) {
            System.out.print("Enter your name please: ");
            String name = scan.nextLine();
            System.out.print("Enter the ISBN of the book: ");
            String isbn = scan.nextLine();

            library.borrowBook(isbn, name);
        } else if(dec.equalsIgnoreCase("return")) {
            System.out.print("Enter the ISBN of the book: ");
            String isbn = scan.nextLine();

            library.returnBook(isbn);
        }
        System.out.println();
        System.out.println("* * * See you again! * * *");
    }
}
