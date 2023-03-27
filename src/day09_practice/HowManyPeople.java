package day09_practice;

import java.util.Scanner;

public class HowManyPeople {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("How many people you live with");
        int num = input.nextInt();

        String people = (num<3)?"Live with less than 3 people":(num>=3 && num<=6)?"Live with 3-6 people"
                : "Live with more than 6 people";
        System.out.println(people);


        System.out.println("...............................");

        System.out.println(" Pleas enter how many people you live with:");
        int num1= input.nextInt();
        String result = "";

        if(num1<3){
            result="Live with less than 3 people";
        }
        if(num1>3 && num1<=6){
            result= "Live with 3-6 people";
        }else {
            result= "Live with more than 6 people";
        }
        System.out.println(result);
        input.close();





        /*
        1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
         */
    }
}
