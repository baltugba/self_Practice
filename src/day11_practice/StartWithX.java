package day11_practice;

import java.util.Scanner;

public class StartWithX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();
        word = word.replace('x','a');
        System.out.println(word);
        input.close();




        /*
        Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, day22_practice.replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
         */
    }
}
