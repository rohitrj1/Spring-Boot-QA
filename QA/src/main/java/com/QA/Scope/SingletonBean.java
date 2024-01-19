package com.QA.Scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class SingletonBean {

    @Autowired
    private ProtoTypeBean protoTypeBean;

    private ObjectFactory<ProtoTypeBean> objectFactory;
    SingletonBean(){
        System.out.println("SingletonBean() instatiated !!");
    }

    public ProtoTypeBean getProtoTypeBean(){
        return this.objectFactory.getObject();
    }


}
