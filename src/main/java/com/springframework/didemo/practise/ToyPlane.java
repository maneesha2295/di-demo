package com.springframework.didemo.practise;

public class ToyPlane implements Toy,Movable,Flyable {
    double price;
    String color;

    @Override
    public void fly() {
        System.out.println("ToyPlane: start toy plane");
    }

    @Override
    public void move() {
        System.out.println("ToyCar: start toy Car");
    }

    @Override
    public void setPrice(double price) {
        this.price=price;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public String toString() {
        return "ToyPlane{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
