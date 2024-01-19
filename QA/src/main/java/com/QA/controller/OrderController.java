package com.QA.controller;

import com.QA.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/api")
    public ResponseEntity<String> getName() {
        return new ResponseEntity<>("This is a get api ", HttpStatus.OK);
    }
}
