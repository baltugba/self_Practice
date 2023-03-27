package day28_practice;

public class Circle {
    private double radius;
    public static double pi;

    static {
        pi = 3.14;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if(radius<= 0){
            System.err.println("Radius can not be 0 or negative number");
            System.exit(1);
        }
        this.radius = radius;
    }
    public Circle(double radius){
        setRadius(radius);
    }
    public double calcArea(){
        return radius*radius*pi;
    }
    public double calcPerimeter(){
        return 2*radius*pi;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                "area=" + calcArea()+
                "perimeter=" + calcPerimeter()+
                '}';
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1);
        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimeter());

    }
}
/*
 Create a class named Circle

        private variables:
            radius

        public variable:
            pi

         Encapsulate all the private fields

                 1. radius of the circle can not be zero or negative

         Add a constructor that can set the radius of circle when circle object is created
                 (If the arguments not valid it should not be set to the instances)

         Methods:
             calcArea()
             calcPerimeter()
             toString(): displays the radius, area and perimeter of the circle when the circle object is passed in the print statement
 */