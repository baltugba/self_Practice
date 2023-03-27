package day34_practice.carTask;

public class CarShop {
    public static void main(String[] args) {

        Audi audi = new Audi("A6",2023,120000,"Purple");

        BMW bmw = new BMW("X7",2022,130000,"Orange");

        Honda honda = new Honda("Pilot",2022,85000,"Blue");

        Mercedes mercedes = new Mercedes("A180",2021,90000,"Gray");

        Nio nio = new Nio("Nio",2023,110000,"Red");

        Tesla tesla = new Tesla("Tesla",2022,125000,"Black");

        Toyota toyota= new Toyota("Corolla",2020,55000,"White");

        CydeoCar cydeocar = new CydeoCar("cydeowl",2023,150000,"Sparkly red");

        System.out.println(mercedes);
        System.out.println(cydeocar);
        System.out.println(tesla);
        System.out.println(toyota);
        System.out.println(nio);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(honda);

        honda.start();
        cydeocar.selfDrive();
        bmw.stop();


    }
}
