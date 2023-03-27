package day07_practice;

public class WeekDays {
    public static void main(String[] args) {
        int num = 11;
        String result ="";

        if(num >=1 && num <=7){
            if(num==1){
                result= "Monday";
            }else if (num==2){
                result="Tuesday";
            }else if(num==3){
                result= "Wednesday";
            }else if(num==4){
                result="Thursday";
            }else if(num==5){
                result="Friday";
            }else if(num==6){
                result= "Saturday";
            }else{
                result="Sunday";
            }

        }else{
            result= "Invalid";
        }
        System.out.println(result);
    }
}
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents.

Ex:
Given:

number = 1

output:

Monday

Note: Assume that the given number is between 1 ~ 7
 */