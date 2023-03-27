package day33_practice.shapeTask;

public class Rectangle extends Shape{
    // Attributes
    // Instance variables
    private double width, length;

    public Rectangle(String name, double width, double length) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * area();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + getClass().getSimpleName());
        System.out.println("* * * * * * * * * * * *");
        for (int i = 0; i < 3; i++) {
            System.out.println("*                     *");
        }
        System.out.println("* * * * * * * * * * * *");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}

