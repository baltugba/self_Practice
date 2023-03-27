package day11_practice;

import java.util.Scanner;

public class fullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        String firstNameUpper= firstName.toUpperCase();
        String restOfFirstName= firstName.substring(1);

        String lastNameUpper = lastName.toUpperCase();
        String restOflastName = lastName.substring(1);

        System.out.println(firstNameUpper.charAt(0)+ restOfFirstName.toLowerCase()+ " "+
        lastNameUpper.charAt(0)+ restOflastName.toLowerCase());
        input.close();







        /*
        Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
         */
    }
}
