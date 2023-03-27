package day14_practice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        int fact=1;

        for(int i = 1; i<=num;i++){
            fact *=i;
        }

        System.out.println(fact);
        /*
         Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */
    }
}
