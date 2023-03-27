package day13_practice;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = input.nextLine();

        System.out.println("Enter your repeating word in sentence");
        String word = input.next();

        System.out.println(frequencyOfWord(sentence,word));
        input.close();






        /*

    /*
    Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
     */
    }

public static int frequencyOfWord(String sentence,String word){
        String word2 =word.substring(0,word.length()-1);
        String sentencetemp=sentence.replace(word,word2);

        int result = sentence.length()-sentence.length();
        return result;
}


    }








