/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.nb.logic.implement;

import com.epam.nb.bean.Request;
import com.epam.nb.bean.RequestParameters;
import com.epam.nb.bean.Response;
import com.epam.nb.dao.memory.NoteBookProvider;
import com.epam.nb.entity.Note;
import com.epam.nb.entity.NoteBook;
import com.epam.nb.logic.Command;
import java.util.Date;

/**
 *
 * @author Nadia
 */
public class AddNewNoteCommand implements Command {

    @Override
    public Response execute(Request request) {
        
        String notes =  (String) request.getParam(RequestParameters.NEW_NOTE);
        Date date =  (Date) request.getParam(RequestParameters.DATE_FOR_NOTE);
        Note note = new Note(notes, date);
        NoteBook noteBook = NoteBookProvider.getInstance().getNoteBook();
        noteBook.addNote(note);
        Response response = new Response();
        response.setStatus(true);
        return response;


    }
}
