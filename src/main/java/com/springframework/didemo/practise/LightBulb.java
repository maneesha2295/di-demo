package com.springframework.didemo.practise;

public class LightBulb implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Bulb: Bulb turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Bulb: Bulb turned off");
    }
}
