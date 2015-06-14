package com.epam.nb.entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Nadia
 */
public class Note {

    private String note;
    private Date date;

    public Note(String note, Date date) {
        this.note = note;
        this.date = date;
    }
    
  public Note() {
        this.note = new String();
        this.date = new Date();
    }
  
       public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

 @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.note);
        hash = 79 * hash + Objects.hashCode(this.date);
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
        final Note other = (Note) obj;
        if (!Objects.equals(this.note, other.note)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Note: \n" + "note=" + note + "\ndate=" + date + '}';
    }   
}
