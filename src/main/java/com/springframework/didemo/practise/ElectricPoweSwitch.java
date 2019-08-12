package com.springframework.didemo.practise;

public class ElectricPoweSwitch implements Switch {
    public Switchable client;
    public boolean on;

    public ElectricPoweSwitch(Switchable client) {
        this.client = client;
        this.on=on;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        boolean checkOn= isOn();
        if(checkOn){
            client.turnOff();
            this.on=false;
        } else {
            client.turnOn();
            this.on=true;
        }

    }
}
