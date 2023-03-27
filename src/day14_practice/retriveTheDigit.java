package day14_practice;

import java.util.Scanner;

public class retriveTheDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.nextLine();
        String digits="";
        String letters="";
        String characters="";

        int word_length=word.length()-1; // it gives you number of characters

        for(int i=0;i<=word_length;i++){
            char x = word.charAt(i);
            if(x >='0' && x<='9') {
                digits +=x;
            }else if (x >='a'&& x<='z' || x>='A'&& x<='Z' ) {
                letters+=x;
            }else {
                characters += x;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("characters = " + characters);




             /*
             write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
              */

    }
}
