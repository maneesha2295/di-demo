package com.springframework.didemo.contoller;

import com.springframework.didemo.service.GreetingService;
import com.springframework.didemo.service.GreetingServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    //@Qualifier("greetingServiceImple");
    public GreetingService greetingServiceImple;

    public String sayHello(){
        return greetingServiceImple.sayGreeting();
    }
}
