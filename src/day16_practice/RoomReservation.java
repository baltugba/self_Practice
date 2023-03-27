package day16_practice;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPrice = 0;

        while (true)
        {
            //Room Type
            System.out.print("Welcome to hotel Cydeo \n King \n Queen \n Single \n");
            System.out.println("Which room type do you want to reserve?");
            String answer = input.next();
            while (!(answer.equalsIgnoreCase("King") || answer.equalsIgnoreCase("Queen") || answer.equalsIgnoreCase("single")))
            {
                System.err.println("Invalid room type! Please re-select again");
                answer=input.next();
            }
            // Number of Nights
            System.out.println("How many nights do you want to stay?");
            int night = input.nextInt();
            while (!(night > 0))
            {
                System.err.println("Invalid day selection! Please re-select again");
                night = input.nextInt();
            }
            if (answer.equalsIgnoreCase("King"))
            {
                totalPrice += 120 * night;
            }
            else if (answer.equalsIgnoreCase("Qeen"))
            {
                totalPrice += 100 * night;
            }
            else
            {
                totalPrice += 80 * night;
            }
            //Another Room
            System.out.println("Would you like to reserve another room");
            String answer2 = input.next();
            while (!(answer2.equalsIgnoreCase("yes") || answer2.equalsIgnoreCase("no")))
            {
                System.err.println("Invalid entry! Please re-select again");
                answer2 = input.next();
            }
            if (answer2.equalsIgnoreCase("no"))
            {
                System.out.println("Total price is : " + totalPrice);
                System.exit(1);
            }

        }
    }
}


/*
. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

                If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */



