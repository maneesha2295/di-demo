package com.springframework.didemo.service;


import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{
    @Override
    public String getEnglishGreeting() {
        return "english greeting ";
    }

    @Override
    public String getSpanishGreeting() {
        return "spanish greeting ";
    }

    @Override
    public String getGermanGreeting() {
        return "german greeting";
    }
}
