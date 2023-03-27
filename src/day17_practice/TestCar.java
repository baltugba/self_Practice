package day17_practice;

public class TestCar {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.setInfo("Bmw", "X5",2022,"Gray",100000);

        Car car2=new Car();
        car2.setInfo("Mercedes","c180",2023,"Black",120000);
        System.out.println(car1);
        System.out.println(car2);

        car1.start();


    }

}
