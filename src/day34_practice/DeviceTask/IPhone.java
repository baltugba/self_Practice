package day34_practice.DeviceTask;

public class IPhone extends Phone implements Downloadable,AppleApp{
    public IPhone( String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("IPhone", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("You can turn on the " + getBrand()+ "  by pressing the button next to the phone");
    }

    @Override
    public void turnOff() {
        System.out.println("You can turn off the " + getBrand()+ "  by pressing the button next to the phone");
    }

    @Override
    public void call(long phoneNum) {
        System.out.println(getBrand()+" is calling the number");

    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" can download app from "+AppStoreName);

    }
}
/*
extends Phone class and implements Downloadable & AppleApps interfaces
 */