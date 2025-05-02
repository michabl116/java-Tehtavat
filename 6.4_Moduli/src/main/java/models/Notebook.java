package models;



import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<Note> notes;

    public Notebook() {
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(notes);
    }

    public String getAllNotesAsString() {
        StringBuilder sb = new StringBuilder();
        for (Note note : notes) {
            sb.append(note.toString()).append("\n");
        }
        return sb.toString();
    }
}
