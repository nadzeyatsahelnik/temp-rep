package com.epam.nb.bean;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Nadia
 */
public class Request {

    Map<RequestParameters, Object> map = new HashMap<>();
    

    public void setParam(RequestParameters paramKey, Object value) {
        map.put(paramKey, value);
    }

    public Object getParam(RequestParameters paramKey) {
        return map.get(paramKey);
    }
}
