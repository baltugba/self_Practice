package day16_practice;

import java.util.Scanner;

public class calcAreaAndPerimeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "";

        while (true) {
            System.out.println("Enter the radius of the circle");
            double radiusOfCircle = input.nextDouble();

            while (radiusOfCircle <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(1);

            }
            System.out.println("Diameter of circle: " + (2 * radiusOfCircle));
            System.out.println("Area of circle: " + (radiusOfCircle * radiusOfCircle * 3.14));
            System.out.println("Perimeter of circle: " + (2 * 3.14 * radiusOfCircle));
            System.out.println("Would you like to calculate another circle? Yes/No");
            answer = input.next().toLowerCase();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid entry. please re-enter again");
                answer = input.next().toLowerCase();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                System.exit(1);
            }
            input.close();
        }

    }
}
/*

4. Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */