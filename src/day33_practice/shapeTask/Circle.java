package day33_practice.shapeTask;

public class Circle extends Shape {

    // Attributes
    // Instance variables of this class
    private double radius;
    public final double pi;

    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
        pi=3.14;
    }

    //getter and setter
    public double getRadius() {
        if (radius <= 0) {
            System.err.println("radius of the circle can not be zero or negative: " + radius);
            System.exit(1);
        }
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
//pi is final there is no setter
    public double getPi() {
        return pi;
    }
//overriding methods
    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return radius * 2 * pi;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");

    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}
