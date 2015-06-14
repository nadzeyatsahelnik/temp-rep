
package com.epam.nb.controller;

import com.epam.nb.bean.Request;
import com.epam.nb.bean.Response;
import com.epam.nb.logic.Command;

/**
 *
 * @author Nadia
 */
public class NoteBookController {
                    NoteBookCommandHelper commandHelper = new NoteBookCommandHelper();

                public Response doCommand(CommandName commandName, Request request){
                                Command command = commandHelper.getCommand(commandName);
                                Response response = command.execute(request);
                                return response;
                }              

   

 

}
