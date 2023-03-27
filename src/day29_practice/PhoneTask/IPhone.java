package day29_practice.PhoneTask;

public class IPhone extends Phone{
    public static String brand;

    static {
        brand = "IPhone";
    }
    public void faceTime(long phoneNumber){
        System.out.println(brand+" is calling"+phoneNumber+" on facetime");
    }
    public void faceTime(String email){
        System.out.println("With "+ brand+ " you can use face time with "+email);
    }
}
