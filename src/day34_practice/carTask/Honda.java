package day34_practice.carTask;

import day34_practice.carTask.Car;

public class Honda extends Car {
    public Honda(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" push the start button");

    }

    @Override
    public void drive() {
        System.out.println(getMake()+" is giving you confortable drive");

    }
}
