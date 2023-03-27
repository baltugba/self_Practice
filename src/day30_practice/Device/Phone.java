package day30_practice.Device;

public class Phone extends Device{

    //Constructor to pass argument

    public Phone(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void call(){
        System.out.println(getBrand()+" "+getModel()+" is calling ");
    }
    public void text(){
        System.out.println(getBrand()+getModel()+" is texting");
    }
}
