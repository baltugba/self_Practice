package day34_practice.carTask;

import day34_practice.carTask.Car;

public class Toyota extends Car {
    public Toyota(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("you need to use your key fot start");

    }

    @Override
    public void drive() {
        System.out.println( getMake()+" "+getModel()+" is being driven");

    }
}
