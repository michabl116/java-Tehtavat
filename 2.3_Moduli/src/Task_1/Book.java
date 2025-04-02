package Task_1;

public class Book {
    private String bookTitle;
    private String bookAuthor ;
    private int bookYear;

    public Book(String bookTitle, String bookAuthor, int bookYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }
    public String getBookTitle() {
        return bookTitle;

    }

}

