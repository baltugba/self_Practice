package day34_practice.carTask;

import day34_practice.carTask.AutoPark;
import day34_practice.carTask.Car;

public class Mercedes extends Car implements AutoPark {
    public Mercedes(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start " + getMake() + " " + getModel());

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel()+" is being driven");

    }

    @Override
    public void autoPark() {
        System.out.println(getMake() +" "+getModel() +" has auto park feature");

    }
}
