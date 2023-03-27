package day34_practice.DeviceTask;

public abstract class Computer extends Device{
    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" "+getModel()+" has turned on after tapping the power button once");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" "+getModel()+" has turned off after tapping the power button once");
    }
}
/*
Create a child abstract class of Device named Computer:

					Add any extra methods if needed

 */