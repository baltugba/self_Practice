package day20_practice;

import java.util.Arrays;

public class ReverseOlmadi {
    public static void main(String[] args) {

        String str =" I love Java";
        String[] str1= str.split(" ");    //spliting the words, each word will be one element of the aaray

        String str_to_reverse = str1[1]; //getting the word that we need to reverse
        String reversed = "";
        for (int i = str1[1].length() - 1; i >= 0; i--) {
            reversed+= ""+ str_to_reverse.charAt(i);

        }
        str1[1]=reversed;
        String newString="";
        for (int i = 0; i < str1.length; i++) {

        }
        newString+=str1 +"";
        System.out.println(newString);





    }

}
/*
1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */