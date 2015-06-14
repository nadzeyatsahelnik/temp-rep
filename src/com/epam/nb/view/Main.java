package com.epam.nb.view;

import com.epam.nb.bean.Request;
import com.epam.nb.bean.RequestParameters;
import com.epam.nb.bean.Response;
import com.epam.nb.controller.CommandName;
import com.epam.nb.controller.NoteBookController;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Nadia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {

        NoteBookController controller = new NoteBookController();
        Request request = new Request();
        
        request.setParam(RequestParameters.NEW_NOTE, "this is new note");
        request.setParam(RequestParameters.DATE_FOR_NOTE, new Date());
        request.setParam(RequestParameters.NOTEBOOK_LIST, request);
        Response response = controller.doCommand(CommandName.ADD_NEW_NOTE, request);
        Response responseCreate = controller.doCommand(CommandName.NEW_NOTEBOOK, request);
       Response responseFind = controller.doCommand(CommandName.FIND_NOTE, request);
        if (responseCreate.getStatus() == true) {
            System.out.println("OK create");
        }
        if (response.getStatus() == true) {
            System.out.println("OK add");
        }
      if (responseFind.getStatus() == true) {
          System.out.println("OK find");
       }

    }
}
