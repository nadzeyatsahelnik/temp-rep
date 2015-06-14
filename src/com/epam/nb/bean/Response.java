package com.epam.nb.bean;

import com.epam.nb.entity.Note;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nadia
 */
public class Response {

    private Note note;
    private List<Note> listNote;
    private boolean status;
    private String errorMassage;

    public Response(Note note, List<Note> listNote, boolean status, String errorMassage) {
        this.note = note;
        this.listNote = listNote;
        this.status = status;
        this.errorMassage = errorMassage;
    }

    public Response() {
        this.note = new Note(errorMassage, null);
        this.listNote = new ArrayList<Note>();
        this.status = false;
        this.errorMassage = new String();
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public List<Note> getListNote() {
        return listNote;
    }

    public void setListNote(List<Note> listNote) {
        this.listNote = listNote;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getErrorMassage() {
        return errorMassage;
    }

    public void setErrorMassage(String errorMassage) {
        this.errorMassage = errorMassage;
    }

    public boolean getStatus() {
       return status;
    }
}
