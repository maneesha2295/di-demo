package com.springframework.didemo.practise;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan turned off");
    }
}
