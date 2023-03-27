package day11_practice;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word");
        String firstWord = input.next();

        System.out.println("Enter your second word");
        String secondWord = input.next();


       int firstWordLength=firstWord.length();
        char firstWordLastChar = firstWord.charAt(firstWord.length()-1);
        char secondWordFirstChar=secondWord.charAt(0);

        if(firstWordLastChar==secondWordFirstChar){
            System.out.println(firstWord+secondWord.substring(1));
        }else{
            System.out.println(firstWord+secondWord);
        }

input.close();







        /*
        Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
         */
    }
}
