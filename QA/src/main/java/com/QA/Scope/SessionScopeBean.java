package com.QA.Scope;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;

@Component
@Setter
@Getter
@Scope(value = WebApplicationContext.SCOPE_SESSION,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionScopeBean {

    private String message;
    public SessionScopeBean(){
        System.out.println("SessionScopeBean() constructor called !! " + LocalDateTime.now());
        this.message = "This is a session - scoped bean ";
    }


}
