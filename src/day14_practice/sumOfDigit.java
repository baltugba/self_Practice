package day14_practice;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String word= input.nextLine();

        int sum=0;
        int wordLength=word.length()-1;

        for(int i=0;i<=wordLength;i++){
            char x=word.charAt(i);
            if(x>='0' && x<='9'){
                sum+=x-48;
            }


        }

        System.out.println(sum);
    }


}
/*

6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */