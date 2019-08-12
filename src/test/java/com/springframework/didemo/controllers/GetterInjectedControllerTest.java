package com.springframework.didemo.controllers;

import com.springframework.didemo.contoller.GetterInjectedController;
import com.springframework.didemo.service.GreetingServiceImple;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

   @Before
    public void setUp() throws Exception{
        this.getterInjectedController=new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImple());
    }

    @Test
    public void testGreet() throws Exception{
       assertEquals(GreetingServiceImple.HEELO_GURUS,getterInjectedController.sayHello());
    }
}
