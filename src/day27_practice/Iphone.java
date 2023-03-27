package day27_practice;

public class Iphone {
    public static void main(String[] args) {
        Iphone phone1 = new Iphone("14 pro","Max","Blue",1200);
        System.out.println(phone1);

        phone1.printOperatingSystem();
        phone1.call(1235467895);
        Iphone.printOperatingSystem();

    }
    public String model,size,color;
    public double price;

    public static String brand,OS,madeIn,designedIn;
    public static boolean isSmartPhone;

    public Iphone(String model, String size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    static {
        brand = "IPhone";
        OS="IOS";
        madeIn="China";
        designedIn = "California";

    }
    public static void printOperatingSystem(){
        System.out.println(OS);
    }
    public void call(long phoneNumber){
        System.out.println("calling this number " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("texting this number " + phoneNumber);
    }
    public void faceTime( long phoneNumber){
        System.out.println("facetiming this number " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println("facetiming this email " + email);
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */