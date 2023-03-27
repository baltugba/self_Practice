package day30_practice.Device;

public class Computer extends Device{
    public Computer(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void coding(){
        System.out.println(getBrand()+ " is a good brand for coding");
    }
}
