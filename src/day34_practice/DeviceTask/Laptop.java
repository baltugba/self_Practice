package day34_practice.DeviceTask;

public class Laptop extends Computer{
    public Laptop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("You can turn on the " + getBrand()+ " computer by pressing the button in the middle of the computer");
    }

    @Override
    public void turnOff() {
        System.out.println("You can turn off the " + getBrand()+ " computer by pressing the button in the middle of the computer");
    }
}
