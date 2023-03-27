package day34_practice.carTask;

public class BMW extends Car {
    public BMW(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+ getModel()+" is starting start button");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" you love to drive");

    }
}
