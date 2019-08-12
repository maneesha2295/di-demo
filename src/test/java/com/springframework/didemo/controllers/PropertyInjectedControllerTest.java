package com.springframework.didemo.controllers;

import com.springframework.didemo.contoller.PropertyInjectedController;
import com.springframework.didemo.service.GreetingServiceImple;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController=new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImple =new GreetingServiceImple();
    }
    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImple.HEELO_GURUS,propertyInjectedController.sayHello());
    }

}
