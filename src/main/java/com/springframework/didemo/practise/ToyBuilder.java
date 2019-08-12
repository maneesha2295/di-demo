package com.springframework.didemo.practise;

import org.springframework.stereotype.Service;

@Service
public class ToyBuilder {
    public static ToyHouse buildToyHouse(){
        ToyHouse toyHouse=new ToyHouse();
        toyHouse.setPrice(100.00);
        toyHouse.setColor("white");
        return toyHouse;
    }
    public static ToyCar buildToyCar(){
        ToyCar toyCar=new ToyCar();
        toyCar.setPrice(200.00);
        toyCar.setColor("red");
        return toyCar;
    }
    public static ToyPlane buildToyPlane(){
        ToyPlane toyPlane=new ToyPlane();
        toyPlane.setPrice(400.00);
        toyPlane.setColor("orange");
        return toyPlane;
    }

}
