package com.springframework.didemo;

import com.springframework.didemo.contoller.ControllerInjectedController;
import com.springframework.didemo.contoller.GetterInjectedController;
import com.springframework.didemo.contoller.MyController;
import com.springframework.didemo.contoller.PropertyInjectedController;
import com.springframework.didemo.practise.ToyBuilder;
import com.springframework.didemo.practise.ToyHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
       ApplicationContext ctx =SpringApplication.run(DiDemoApplication.class, args);
        MyController myController=(MyController) ctx.getBean("myController");

        System.out.println(myController.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ControllerInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ToyBuilder.class).buildToyCar());
        System.out.println(ctx.getBean(ToyBuilder.class).buildToyHouse());
        System.out.println(ctx.getBean(ToyBuilder.class).buildToyPlane());

    }

}
