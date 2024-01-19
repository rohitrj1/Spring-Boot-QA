package com.QA.Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Scope("prototype")
public class  BeanScopeTestService {

    public BeanScopeTestService(){
        System.out.println("BeanScopeTestService() instance created....");
    }
}
