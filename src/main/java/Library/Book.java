package Library;

public class Book {

    private String title;
    private String author;
    private String bookNum;
    private boolean isAvailable;
    private String borrowerName = "";

    public Book(String title, String author, String bookNum, boolean isAvailable, String borrowerName) {
        this.title = title;
        this.author = author;
        this.bookNum = bookNum;
        this.isAvailable = isAvailable;
        this.borrowerName = borrowerName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookNum() {
        return bookNum;
    }

    public void setBookNum(String bookNum) {
        this.bookNum = bookNum;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }
}
