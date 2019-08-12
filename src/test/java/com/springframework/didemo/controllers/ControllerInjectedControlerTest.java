package com.springframework.didemo.controllers;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.springframework.didemo.contoller.ControllerInjectedController;
import com.springframework.didemo.service.GreetingServiceImple;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ControllerInjectedControlerTest {
    private ControllerInjectedController controllerInjectedController;
    @Before
    public void setUp() throws Exception{
        this.controllerInjectedController=new ControllerInjectedController(new GreetingServiceImple());
    }

    @Test
    public void testConstructor() throws Exception{
        assertEquals(GreetingServiceImple.HEELO_GURUS,controllerInjectedController.sayHello());
    }
}
