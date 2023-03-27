package day09_practice;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter miles");

        double miles = input.nextDouble();
        double km = 1.6;

        double milesToKm =  miles*km;
        System.out.println( miles +" miles equal to "  +milesToKm+ " kilometers");

input.close();
    }
}
