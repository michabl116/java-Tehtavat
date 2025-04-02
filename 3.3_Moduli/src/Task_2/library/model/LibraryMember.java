package Task_2.library.model;
import  java.util.ArrayList;
import  java.util.List;

public class LibraryMember {
    private String name;
    private String memberID;

    private List<Book> borrowedBooks;

    public LibraryMember( String name, String memberID) {
        this.name = name;
        this.memberID = memberID;

        borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public String getMemberID() {
        return memberID;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }



}
