package com.epam.nb.logic.implement;

import com.epam.nb.bean.Request;
import com.epam.nb.bean.Response;
import com.epam.nb.dao.memory.NoteBookProvider;
import com.epam.nb.entity.NoteBook;
import com.epam.nb.logic.Command;

/**
 *
 * @author Nadia
 */
public class CreateNewNoteCommand implements Command {

    @Override
    public Response execute(Request request) {

        NoteBook noteBook = NoteBookProvider.getInstance().getNoteBook();
        Response response = new Response();
        response.setStatus(true);
        return response;
    }
}
