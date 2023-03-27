package day08_practice;

public class OxygenTank {
    public static void main(String[] args) {

        int num= 80;

        String result = (num>=90)?"Your tank is full":(num>=80)?"Still ok":(num>=70)?
                "Don't go too far":(num>=60)?"Start to head back":"Be careful now you at at%50";

        System.out.println(result);












        /*
        eate a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
         */

    }

}
