package com.springframework.didemo.practice;

import com.springframework.didemo.practise.*;
import org.junit.Test;

public class ElectricPowerSwitchTest {
   @Test
    public void testPress() throws Exception{
        Switchable switchableBilb=new LightBulb();
        Switch bulbPowerSwitch=new ElectricPoweSwitch(switchableBilb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();
        Switchable switchableFan=new Fan();
        Switch fanPowerSwitch=new ElectricPoweSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}
