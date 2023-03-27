package day28_practice;

public class Square {
    private int side;
    //encapsule instance variable
    public int getSide(){//getter
        return side;
    }
    public void setSide(int side){//setter
        if(side<0){
            System.err.println("Side of the square can not be negative");
            System.exit(1);
        }
        this.side = side;

    }
    //constractor to set instance variable
    public Square(int side){
        setSide(side);
    }
    //action
    //instance methods
    public int calcArea(){//returns the area of square
        return getSide()*getSide();

    }
    public int calcPerimeter(){//returns the perimeter of square
        return getSide()*4;

    }

    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                "area=" + calcArea()+
                "perimeter="+calcPerimeter()+
                '}';
    }

    public static void main(String[] args) {
        Square s1 = new Square(5);
        System.out.println(s1);
        System.out.println(s1.calcArea());
        System.out.println(s1.side);
        System.out.println(s1.calcPerimeter());
    }
}
/*

2. Create a class named Square:
        Private variables:
            side

        Encapsulate all the fields

            Condition:
                side of the square should not be negative

        Add a constructor that allows user to set all the fields when the object is created.


        Methods:
            calcArea(): returns the area of square
            calcPerimeter(): returns the perimeter of square
            toString(): can display the side, area, perimeter of square when object is passed in print statement
 */