package com.QA.services;

import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal{
    @Override
    public String character() {
        return "BARKING....";
    }
}
