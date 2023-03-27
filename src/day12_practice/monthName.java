package day12_practice;

import java.util.Scanner;

public class monthName {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in))    ;
monthName(5);
monthName(9);
monthName(15);


input.close();
    }
    public static void monthName(int month){

      String result = "";
      if(month==1){
          result = "January";
      }else if(month==2){
          result= "February";
      }else if(month==3){
          result="March";
      }else if(month==4){
          result="April";
      }else if(month==5){
          result= "May";
      }else if(month==6){
          result= "June";
      }else if(month==7){
          result= "July";
      }else if(month==8){
          result= "August";
      }else if(month==9){
          result= "September";
      }else if(month==10){
          result="October";
      }else if(month==11){
          result= "November";
      }else if(month==12){
          result= "December";
      }else{
          result= "Invalid ";
      }
        System.out.println(result);


    }

    /*
     Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
     */
}
