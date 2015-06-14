package com.epam.nb.entity;

import com.epam.nb.view.NoteBookConsoleView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Nadia
 */
public class NoteBook extends Note {

    private List<Note> notes;
    private Note note;

    public NoteBook() {
        this.note = new Note();
        this.notes = new ArrayList<>();
    }

    public NoteBook(List<Note> notes) {
        this.notes = notes;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public void addList(List<Note> list) {
        this.notes.addAll(list);
    }

    public void addNote(Note note) {

        this.notes.add(note);
        NoteBookConsoleView nb = new NoteBookConsoleView();
        nb.print(note);

    }

    public void finNotesByName(String note) {

        if (this.notes.toString().contains(note)) {
            System.out.println("содержит");
            NoteBookConsoleView nb = new NoteBookConsoleView();
            nb.print(notes);
        } else {
            System.out.println("НЕ содержит");
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.notes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NoteBook other = (NoteBook) obj;
        if (!Objects.equals(this.notes, other.notes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NoteBook:" + "notes=" + notes;
    }
}
