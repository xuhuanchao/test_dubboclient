package com.xhc.test.dubboclient;

import java.io.Serializable;
import java.util.Map;

public class DubboRequest implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 2501636048868915447L;
    private String action;
    private Map<String, Object> params;

    public DubboRequest() {
        super();
        // TODO Auto-generated constructor stub
    }
    public DubboRequest(String action, Map<String, Object> params) {
        super();
        this.action = action;
        this.params = params;
    }
    
    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    public Map<String, Object> getParams() {
        return params;
    }
    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
    
    
}
