package day26_practice;

public class Circle {
    public static void main(String[] args) {
        Circle c1= new Circle(5);
        System.out.println(c1);

        System.out.println(c1.calcArea());

        System.out.println(c1.calcDiameter());
        Circle.printPi();
    }
    public double radius;
    public static double pi= 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calcArea(){
        double area = pi*radius*radius;
        return area;
    }
    public double calcPerimeter(){
        double perimeter = 2*pi*radius;
        return perimeter;
    }
    public static void printPi(){
        System.out.println("Pi value is: " + pi);
    }
    public double calcDiameter(){
        double diameter = radius*2;
        return diameter;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "diameter="+ calcDiameter()+
                "pi="+pi+
                "area="+ calcArea()+
                "perimeter="+ calcPerimeter()+
                '}';
    }
}
/*
1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
 */