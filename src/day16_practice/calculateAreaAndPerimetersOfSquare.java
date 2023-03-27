package day16_practice;

import java.util.Scanner;

public class calculateAreaAndPerimetersOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the side of the square:");
            double side = input.nextDouble();

            while (side <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(1);
            }
            System.out.println("Area of square is:" + (side * side));
            System.out.println("Perimeter of square is:" + (side + side + side + side));
            System.out.println("Would you like to calculate another Square? yes/no");
            String answer = input.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid entry. please re-enter again");
                answer = input.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                System.exit(1);
            }
        }

    }
}
/*

5. Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */