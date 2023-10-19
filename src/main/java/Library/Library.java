package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books = new ArrayList<>();

    public void addBook(String title, String author, String bookNum, boolean isAvailable, String borrowerName) {
        Book book = new Book(title, author, bookNum, isAvailable, borrowerName);
        books.add(book);
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("<< Book collection of Sky Library >>");
            System.out.println();

            for (Book book : books) {
                System.out.println("- Title: " + book.getTitle());
                System.out.println("- Author: " + book.getAuthor());
                System.out.println("- ISBN: " + book.getBookNum());
                System.out.println("- Available: " + book.isAvailable());
                System.out.println("- Borrower Name: " + book.getBorrowerName());
                System.out.println("---------------------------------");
            }
        }
    }

    public void borrowBook(String bookNum, String borrowerName) {
        for (Book book : books) {
            if (book.getBookNum().equalsIgnoreCase(bookNum) && book.isAvailable()) {
                book.setAvailable(false);
                book.setBorrowerName(borrowerName);

                System.out.println(book.getTitle() + " has been borrowed by " + borrowerName);
                System.out.println();
                return;
            }
        }

        System.out.println("Book with book number '" + bookNum + "' is not available for now.");
        System.out.println();
    }

    public void returnBook(String bookNum) {
        for (Book book : books) {
            if (book.getBookNum().equalsIgnoreCase(bookNum) && !book.isAvailable()) {
                book.setAvailable(true);
                book.setBorrowerName("");

                System.out.println(book.getTitle() + " has been returned.");
                System.out.println();
                return;
            }
        }

        System.out.println("Book with book number '" + bookNum + "' is available.");
        System.out.println();
    }

    public void deleteBookByIsbn(String bookNum) {
        books.removeIf(book -> book.getBookNum().equalsIgnoreCase(bookNum));
    }

    public List<Book> searchByTitle(String title) {
        List<Book> searchResult = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                searchResult.add(book);
                return searchResult;
            }
        }

        System.out.println("There is no book matched with this title.");
        return searchResult;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> searchResult = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                searchResult.add(book);
                return searchResult;
            }
        }

        System.out.println("There is no book matched with this author.");
        return searchResult;
    }

    public Book searchByBookNum(String bookNum) {
        for (Book book : books) {
            if (book.getBookNum().equalsIgnoreCase(bookNum)) {
                return book;
            }
        }

        System.out.println("There is no book matched with this book number.");
        return null;
    }
}
