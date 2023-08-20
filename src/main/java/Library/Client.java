package Library;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Client {

    private String clientName;

    private final Set<Book> borrowedBooks = new HashSet<>();

    Scanner scan = new Scanner(System.in);

    public Client(String clientName) {
        this.clientName = clientName;
    }

    public void pickBook() {
        Book[] books = {new BraveNewWorld(), new GreatExpectations(), new Hamlet(), new HeartOfDarkness(), new JaneEyre(),
                new Macbeth(), new PrideAndPrejudice(), new TheGoodEarth(), new TheScarlettLetter(), new TreasureIsland()};

        for(Book b : books) {
            System.out.println("Book Id: " + b.getId() + "\n" +
                               "Book Name: " + b.getName() + "\n" +
                               "Book Author: " + b.getAuthor() + "\n" +
                               "Available: " + b.isAvailable());
            System.out.println();
        }

        System.out.print("\tEnter the id of the book you want to pick: ");
        int pick = scan.nextInt();

        for(Book b : borrowedBooks) {
            if(pick == b.getId()) {
                System.out.println();
                System.out.println("<< You already picked this book.\n" +
                                   "Pick a different book. >>");
                System.out.println();
                pickBook();
            }
        }

        switch (pick) {
            case 1 -> borrowedBook(new BraveNewWorld());
            case 2 -> borrowedBook(new GreatExpectations());
            case 3 -> borrowedBook(new Hamlet());
            case 4 -> borrowedBook(new HeartOfDarkness());
            case 5 -> borrowedBook(new JaneEyre());
            case 6 -> borrowedBook(new Macbeth());
            case 7 -> borrowedBook(new PrideAndPrejudice());
            case 8 -> borrowedBook(new TheGoodEarth());
            case 9 -> borrowedBook(new TheScarlettLetter());
            case 10 -> borrowedBook(new TreasureIsland());
            default -> {
                System.out.println();
                System.out.println("<< Invalid number! Try again. >>");
                System.out.println();
                pickBook();
            }
        }
        System.out.println();
        System.out.println("Nice choice. The book(s) you are currently borrowing -> ");
        showBorrowedBooks();
    }

    public void borrowedBook(Book book) {
        this.setBorrowedBooks(book);
    }

    public void showBorrowedBooks() {
        for(Book b : borrowedBooks) {
            System.out.println("- Book Name: " + b.getName());
        }
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Set<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book book) {
        this.borrowedBooks.add(book);
    }
}
