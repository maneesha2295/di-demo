package com.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){
        return "i was injected by constructor";
    }
}
