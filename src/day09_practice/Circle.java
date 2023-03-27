package day09_practice;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
         double radius= input.nextDouble();

         double pi = 3.14;
         double area = pi* radius*radius;
         double perimeter = 2*pi*radius;
        System.out.println("Area="+ area);
        System.out.println("perimeter="+perimeter);
        input.close();








        /*
        Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
         */
    }
}
