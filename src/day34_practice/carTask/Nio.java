package day34_practice.carTask;

import day34_practice.carTask.AutoPark;
import day34_practice.carTask.AutoPilot;
import day34_practice.carTask.Car;

public class Nio extends Car implements AutoPark, AutoPilot {
    public Nio(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println();
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

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" has self drive mod");

    }
}
