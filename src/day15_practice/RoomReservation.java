package day15_practice;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        String roomType = "";
        String reservation = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to reserve a room");
        reservation = input.nextLine();

        while (!(reservation.equalsIgnoreCase("Yes") || reservation.equalsIgnoreCase("No"))) {
            System.err.println("Invalid answer! Please re-answer again");
            reservation = input.nextLine();
        }
        if(reservation.equalsIgnoreCase("yes")) {
            System.out.println("Which type of room do you like?" + "\n" + "King Bed:120$" + "\n" + "Queen Bed:100$" + "\n" + "Single Bed:80$");
            roomType = input.nextLine();
            while (!(roomType.equalsIgnoreCase("King") || roomType.equalsIgnoreCase("Queen") || roomType.equalsIgnoreCase("Single"))) {
                System.err.println("Invalid answer! Please re-answer again");
                roomType = input.nextLine();
            }
            if (roomType.equalsIgnoreCase("King")) {
                System.out.println("You reserved a "+roomType+" room and total price is 120$" );
            } else if (roomType.equalsIgnoreCase("Queen")) {
                System.out.println("You reserved a "+roomType+" room and total price is 100$" );
            } else{
                System.out.println("You reserved a "+roomType+" room and total price is 80$" );
            }

        }else {
            System.out.println("Have a nice day");
        }
        }
    }

/*

	8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

 */