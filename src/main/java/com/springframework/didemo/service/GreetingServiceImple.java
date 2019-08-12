package com.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service

public class GreetingServiceImple  implements GreetingService{
        public static final String HEELO_GURUS ="hello guru--!!";

        @Override
        public String sayGreeting(){
        return HEELO_GURUS;
    }
}
