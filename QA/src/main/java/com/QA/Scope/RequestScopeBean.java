package com.QA.Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST , proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestScopeBean {

    private String message;

    public RequestScopeBean(){
        System.out.println("RequestScopeBean() constructor called !!!..");
        this.message = "This is a request bean scope";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
