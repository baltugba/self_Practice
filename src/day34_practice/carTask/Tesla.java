package day34_practice.carTask;

import day34_practice.carTask.AutoPark;
import day34_practice.carTask.AutoPilot;
import day34_practice.carTask.Car;

public class Tesla extends Car implements AutoPilot, AutoPark {
    public Tesla(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() +" "+getModel() +" has auto park feature");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() +" "+getModel()+" has self drive features");
    }

    @Override
    public void start() {

        System.out.println("Press the start button to start " + getMake() + " " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving Tesla is fun");

    }
}
