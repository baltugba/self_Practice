package day30_practice.Device;

public class Tv extends Device{
    public Tv(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void channelUp(){
        System.out.println(getBrand()+" is switching tv channel up");
    }
    public void channelDown(){
        System.out.println(getBrand()+" is switching tv channel down");
    }
}
