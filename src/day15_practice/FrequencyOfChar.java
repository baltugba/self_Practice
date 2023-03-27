package day15_practice;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your string value "); //aabcccd
        String str= input.nextLine();

        System.out.println("Enter your char value "); //'c'
        char ch= input.next().charAt(0);
        input.close();

        int frequency=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){ // each character of the string
                frequency+=1;
            }
        }
        System.out.println("frequency " + frequency);
input.close();


    }
}


/*

3. Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */