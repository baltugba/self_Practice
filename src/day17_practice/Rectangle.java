package day17_practice;

public class Rectangle {

    public double length, width, area, perimeter;
    public Rectangle() {
    }
    public Rectangle(double area) {
    }
    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        area= length*width;
        return area;
    }
    public double calculatePerimeter(){
        perimeter= 2*(length+width);
        return perimeter;
    }
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        rec.setInfo(3,4);
        rec.calculatePerimeter();
        rec.calculateArea();
        System.out.println(rec);
    }


}
/*

3. create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
		    toString(): when a rectangle object is passed in print statement
		    		it should display the length, width, area and perimeter of the Rectangle object
 */