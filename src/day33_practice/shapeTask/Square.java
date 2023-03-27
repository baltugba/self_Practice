package day33_practice.shapeTask;

public class Square extends Shape {
    public Square(String name, double side) {
        super(name);
        setSide(side);
    }

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + getClass().getSimpleName());
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 4; i++) {
            System.out.println("\t*         *");
        }
        System.out.println("\t* * * * * *");
    }
}

