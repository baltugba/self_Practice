package day34_practice.DeviceTask;

public class Samsung extends Phone implements Downloadable,AndroidApps{
    public Samsung(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("You can turn on the " + getBrand()+ "  by pressing the button on the buttom of the phone");
    }

    @Override
    public void turnOff() {
        System.out.println("You can turn off the " + getBrand()+ "  by pressing the button on the buttom of the the phone");
    }



    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " can download app from " + AppStoreName);

    }
}
/*
extends Phone class and implements Downloadable & AndroidApps interfaces
 */