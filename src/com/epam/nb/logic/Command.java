
package com.epam.nb.logic;

import com.epam.nb.bean.Request;
import com.epam.nb.bean.Response;

/**
 *
 * @author Nadia
 */
public interface Command {
    Response execute(Request request);
}
