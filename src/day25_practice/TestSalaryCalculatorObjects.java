package day25_practice;

public class TestSalaryCalculatorObjects {
    public static void main(String[] args) {

        SalaryCalculator employee1 = new SalaryCalculator(15,40,5,7.5);
        System.out.println(employee1);

        SalaryCalculator employee2 = new SalaryCalculator(45,40,6.5,7.5);
        System.out.println(employee2);
    }
}
