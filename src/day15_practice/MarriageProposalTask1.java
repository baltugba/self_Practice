package day15_practice;

import java.util.Scanner;

public class MarriageProposalTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Will you marry me?");
        String answer=input.next();



        while (!(answer.equalsIgnoreCase("Yes")|| answer.equalsIgnoreCase("No"))){
            System.err.println("Invalid answer! Please re-answer again");
            answer= input.next();
        }



        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
            input.close();
        }


    }
}
/*
 Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
 */