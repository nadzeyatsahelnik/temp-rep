/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.nb.controller;

import com.epam.nb.logic.Command;
import com.epam.nb.logic.implement.AddNewNoteCommand;
import com.epam.nb.logic.implement.CreateNewNoteCommand;
import com.epam.nb.logic.implement.FindNoteCommand;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Nadia
 */
public class NoteBookCommandHelper {
                    Map<CommandName, Command> commands = new HashMap<>();
                
                NoteBookCommandHelper(){
                                commands.put(CommandName.NEW_NOTEBOOK, new CreateNewNoteCommand());
                                commands.put(CommandName.ADD_NEW_NOTE, new AddNewNoteCommand());
                                commands.put(CommandName.FIND_NOTE, new FindNoteCommand());
                }

                public Command getCommand(CommandName command){
                                return commands.get(command);
                }

}
