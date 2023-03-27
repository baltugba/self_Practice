package day29_practice.PhoneTask;

public class Nokia extends Phone{
    public static String brand;
    static {
        brand= "Nokia";
    }
    public void selfDefense(){
        System.out.println("You can use " + brand + " when someone attack you!!");
    }
}
