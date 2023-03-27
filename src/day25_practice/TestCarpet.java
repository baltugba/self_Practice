package day25_practice;

public class TestCarpet {
    public static void main(String[] args) {

        Carpet TurkishCarpet = new Carpet(4, 6, 20, false);
        Carpet PersianCarpet = new Carpet(4, 6, 20, true);

        System.out.println(TurkishCarpet);
        System.out.println(PersianCarpet);
    }
}
