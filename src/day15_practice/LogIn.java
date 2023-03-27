package day15_practice;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your username");
        String userName = input.nextLine();
        System.out.println(" Enter your password");
        String password = input.nextLine();


        if (!(userName.equals("Cydeo") && (password.equals("Cydeo123")))) {
            for (int i = 3; i > 0; i--) {
                System.out.println("You have" + i + " attempts to enter correct credentials");
                userName = input.next();
                password = input.next();

            }
            System.out.println("Your account is blocked");
        }
        if (userName.equals("Cydeo") && (password.equals("Cydeo123"))) {
            System.out.println("You logged in\nWelcome to Cydeo");


        }
        input.close();

    }

}
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."

 */