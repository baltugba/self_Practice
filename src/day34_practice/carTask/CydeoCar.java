package day34_practice.carTask;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {
    public CydeoCar(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() +" "+getModel() +" has auto park feature");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" has self drive features");

    }

    @Override
    public void start() {
        System.out.println("Press the start button to start " + getMake() + " " + getModel());
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" driving like a dream");

    }

    @Override
    public void fly() {
        System.out.println(getMake() +" "+getModel()+" can fly");
    }

}
