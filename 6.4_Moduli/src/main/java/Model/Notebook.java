package Model;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<Note> notes = new ArrayList<>();

    public void addNote(String title, String content) {
        notes.add(new Note(title, content));
    }

    public List<Note> getNotes() {
        return notes;
    }
}
