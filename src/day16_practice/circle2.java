package day16_practice;

import java.util.Scanner;

public class circle2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String answer = "yes";

        while(answer.equals("yes")){
            System.out.println("Enter the radius");
            double radius = input.nextDouble();

            if(radius <=0){
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(1);
            }

            double diameter = 2 * radius;
            double area =  3.14 * radius * radius;
            double perimeter = 2 * 3.14 * radius;

            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another circle?");
            answer = input.next().toLowerCase();

            while( ! (answer.equals("yes") || answer.equals("no")) ){
                System.err.println("invalid entry, please re-enter");
                answer = input.next().toLowerCase();
            }

            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }

        }

        input.close();


    }
}






