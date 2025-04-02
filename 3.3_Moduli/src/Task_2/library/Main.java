package Task_2.library;

import Task_2.library.model.Book;
import Task_2.library.model.LibraryMember;
import Task_2.library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Añadir libros / Lisää kirjoja
        Book book1 = new Book("El Quijote", "Miguel de Cervantes", "1234567890");
        Book book2 = new Book("Cien años de soledad", "Gabriel García Márquez", "0987654321");
        library.addBook(book1);
        library.addBook(book2);

        // Añadir miembros / Lisää jäseniä
        LibraryMember member1 = new LibraryMember("Juan Pérez", "M001");
        LibraryMember member2 = new LibraryMember("Ana García", "M002");
        library.addMember(member1);
        library.addMember(member2);

        // Realizar préstamos / Suorita lainoja
        library.borrowBook("M001", "1234567890");
        library.borrowBook("M002", "0987654321");

        // Show borrowed books / Näytä lainatut kirjat
        System.out.println("Books borrowed by " + member1.getName() + ": " + member1.getBorrowedBooks().size());

        for (Book book : member1.getBorrowedBooks()) {
            System.out.println("- " + book.getTitle());
        }

        System.out.println("Books borrowed by " + member2.getName() + ": " + member2.getBorrowedBooks().size());
        for (Book book : member2.getBorrowedBooks()) {
            System.out.println("- " + book.getTitle());
        }

        // Realizar devoluciones / Suorita palautukset
        library.returnBook("M001", "1234567890");

        // Show borrowed books after return / Näytä lainatut kirjat palautuksen jälkeen
        System.out.println("Books borrowed by " + member1.getName() + " after return: " + member1.getBorrowedBooks().size());
    }
}
