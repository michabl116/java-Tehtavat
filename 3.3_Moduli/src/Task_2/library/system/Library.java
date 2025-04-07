package Task_2.library.system;

import Task_2.library.model.Book;
import Task_2.library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books; // Lista de libros / Kirjalista
    private List<LibraryMember> members; // Lista de miembros / Jäsenlista

    public Library() {
        this.books = new ArrayList<>(); // Inicializar lista de libros / Kirjalistan alustaminen
        this.members = new ArrayList<>(); // Inicializar lista de miembros / Jäsenlistan alustaminen
    }

    // Métodos para añadir libros y miembros / Menetelmät kirjojen ja jäsenten lisäämiseksi
    public void addBook(Book book) {
        books.add(book); // Añadir libro a la lista / Lisää kirja listaan
    }

    public void addMember(LibraryMember member) {
        members.add(member); // Añadir miembro a la lista / Lisää jäsen listaan
    }

    // Métodos para gestionar préstamos y devoluciones / Menetelmät lainojen ja palautusten hallintaan
    public void borrowBook(String memberId, String isbn) {
        LibraryMember member = findMemberById(memberId); // Buscar miembro por ID / Etsi jäsen ID:n perusteella
        Book book = findBookByIsbn(isbn); // Buscar libro por ISBN / Etsi kirja ISBN:n perusteella
        if (member != null && book != null) {
            member.borrowBook(book); // Prestar libro al miembro / Lainaa kirja jäsenelle
        }
    }

    public void returnBook(String memberId, String isbn) {
        LibraryMember member = findMemberById(memberId); // Buscar miembro por ID / Etsi jäsen ID:n perusteella
        Book book = findBookByIsbn(isbn); // Buscar libro por ISBN / Etsi kirja ISBN:n perusteella
        if (member != null && book != null) {
            member.returnBook(book); // Devolver libro del miembro / Palauta kirja jäseneltä
        }
    }

    // Métodos auxiliares para encontrar libros y miembros / Apumenetelmät kirjojen ja jäsenten löytämiseksi
    private LibraryMember findMemberById(String memberId) {
        for (LibraryMember member : members) {
            if (member.getMemberID().equals(memberId)) { // Comparar ID de miembro / Vertaa jäsenen ID:tä
                return member; // Devolver miembro encontrado / Palauta löydetty jäsen
            }
        }
        return null; // Devolver null si no se encuentra / Palauta null, jos ei löydy
    }

    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) { // Comparar ISBN del libro / Vertaa kirjan ISBN:tä
                return book; // Devolver libro encontrado / Palauta löydetty kirja
            }
        }
        return null; // Devolver null si no se encuentra / Palauta null, jos ei löydy
    }
}
