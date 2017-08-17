package com.xhc.test.dubboclient;

import java.io.Serializable;
import java.util.Map;

public class DubboResponse implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 2154426164404804787L;


    private String retcode;
    private Map<String, Object> resbody;
    
    public DubboResponse() {
        super();
        // TODO Auto-generated constructor stub
    }
    public DubboResponse(String retcode, Map<String, Object> resbody) {
        super();
        this.retcode = retcode;
        this.resbody = resbody;
    }

    public String getRetcode() {
        return retcode;
    }
    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }
    public Map<String, Object> getResbody() {
        return resbody;
    }
    public void setResbody(Map<String, Object> resbody) {
        this.resbody = resbody;
    }
    
}
