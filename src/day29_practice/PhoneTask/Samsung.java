package day29_practice.PhoneTask;

public class Samsung extends Phone{

    public static String brand;
    static {
        brand = "Samsung";
    }
    public void freeze(){
        System.out.println(brand+ " is freezing when it is -10");
    }


}
