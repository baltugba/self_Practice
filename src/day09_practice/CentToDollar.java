package day09_practice;

import java.util.Scanner;

public class CentToDollar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter cents:");
        int cent = input.nextInt();

        int dollar = cent/100;
        cent -= dollar *100;

        System.out.println(dollar+ " dollars and " + cent+" cents");
        input.close();








        /*
        Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
         */
    }
}
