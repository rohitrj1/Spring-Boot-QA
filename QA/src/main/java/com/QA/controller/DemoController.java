package com.QA.controller;

import com.QA.Scope.RequestScopeBean;
import com.QA.Scope.SessionScopeBean;
import com.QA.services.Animal;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {


    @Autowired
    @Resource(name = "dog")
    private Animal animal;

//    @Autowired
//    private RequestScopeBean requestScopeBean;
    @Autowired
    private SessionScopeBean sessionScopeBean;

    @GetMapping("/animalCharacter")
    public String getCharacter(){
        return animal.character();
    }


//    @GetMapping("/message")
//    public ResponseEntity<String> getMessage(){
//        String message = this.requestScopeBean.getMessage();
//        return new ResponseEntity<>(message , HttpStatus.OK);
//    }
    @GetMapping("/")
    public ResponseEntity<String> getMessageSession(){
        String message = this.sessionScopeBean.getMessage();
        return new ResponseEntity<>(message , HttpStatus.OK);
    }
}
