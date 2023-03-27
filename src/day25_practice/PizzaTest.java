package day25_practice;

public class PizzaTest {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('M',2,2);
        System.out.println(pizza1);
        System.out.println(pizza1.calcCost());

        Pizza pizza2 = new Pizza('L',5,1);
        System.out.println(pizza2);
        System.out.println(pizza2.calcCost());

    }
}
