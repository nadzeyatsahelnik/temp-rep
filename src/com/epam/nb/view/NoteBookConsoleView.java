package com.epam.nb.view;

import com.epam.nb.entity.Note;
import com.epam.nb.entity.NoteBook;
import java.util.List;

/**
 *
 * @author Nadia
 */
public class NoteBookConsoleView {

    public void print(Note note) {
        System.out.println(note);
    }

    public void print(List<Note> notes) {
        System.out.println(notes);
    }

    public void print(NoteBook noteBook) {
        System.out.println(noteBook);
    }
}
