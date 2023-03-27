package day29_practice.CarTask;

public class TestCar {
    public static void main(String[] args) {

        Audi a1 = new Audi();
        a1.setInfo("A4","White",2022,85000);

        Bmw b1 = new Bmw();
        b1.setInfo("bm1","Red",2023,95000);

        Honda h1 = new Honda();
        h1.setInfo("Civic","Blue",2000,45000);

        Mercedes m1 = new Mercedes();
        m1.setInfo("c180","Gray",2023,120000);

        Toyota t1 = new Toyota();
        t1.setInfo("Corolla","Black",2021,45000);

        Volvo v1 = new Volvo();
        v1.setInfo("c90","green",2022,100000);

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(h1);
        System.out.println(m1);
        System.out.println(t1);
        System.out.println(v1);


    }
}
