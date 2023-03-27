package day34_practice.DeviceTask;

public class DeviceShop {
    public static void main(String[] args) {

        IPhone iphone = new IPhone("14 Pro Max", 1300,"Black", "Large", true,true);
        Samsung samsung = new Samsung("Galaxy3",850,"White","Medium",true,true);
        Google google = new Google("ABC",600,"Blue","Medium",true,true);

        PersonalComputer personalComputer = new PersonalComputer("Lenovo","XXX",1200,"Black","Large",true,true);
        Desktop desktop = new Desktop("LG","LG2",500,"Black","Medium",true,true);
        Laptop laptop = new Laptop("Asus","ZZZ",1100,"Grey","Large",true,true);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(google);

        System.out.println(personalComputer);
        System.out.println(desktop);
        System.out.println(laptop);
    }
}
