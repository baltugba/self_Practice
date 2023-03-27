package day29_practice.EmployeeTask;

public class TestEmployee {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Tugba",'F',39,"BATCH28","QA",120000);

        Developer developer1 = new Developer();
        developer1.setInfo("Tayfun",'M',45,"b23","Developer",150000,"Java");

        Teacher teacher1 = new Teacher();
        teacher1.setInfo("Defne",'F',22,"D12","Teacher",80000);

        Driver driver1 = new Driver();
        driver1.setInfo("Emre",'M',25,"E23","Driver",95000);

        System.out.println(tester1);
        System.out.println(developer1);
        System.out.println(teacher1);
        System.out.println(driver1);

        tester1.testing();
        driver1.testing();
        developer1.coding();

        teacher1.teaching();

    }
}
