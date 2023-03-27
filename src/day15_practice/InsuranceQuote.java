package day15_practice;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int liability= 0;
        int fullCoverage=0;


        System.out.println("Enter your name");
        String name= input.nextLine();
        System.out.println("Enter your gender");
        String gender= input.nextLine();

        while(!(gender.equals("male") ||gender.equals("female"))){
            System.out.println("Invalid answer. Please re=answer again");
            gender= input.next();
        }
           System.out.println("Are you married? Yes/No");
           String married= input.next();

        while(!(married.equalsIgnoreCase("Yes")|| married.equalsIgnoreCase("No"))){
            System.out.println("Invalid answer. Please re-answer again");
            married= input.next();
        }
        System.out.println(("Enter your age"));
        int age= input.nextInt();

        while(!(age >0 && age <120)){
            System.out.println("Invalid age. Please re-enter your age");
            age= input.nextInt();
        }
        System.out.println("How many miles you drives in a day");
        double miles= input.nextInt();

        while(!(miles>5)){
            System.out.println("Invalid mileage. Please re-enter again");
            miles= input.nextDouble();

        }
        System.out.println("Do you want full coverage or liability insurance");
        String insuranceType=input.next();

        System.out.println("Do you have any claims in past 5 years. Yes/No");
        String claim=input.next();

        while(!(claim.equalsIgnoreCase("Yes")|| claim.equalsIgnoreCase("No"))){
            System.out.println("Invalid answer. Please re-answer again");
        }
        System.out.println("Do you have anti-theft device? Yes/No");
        String antiTheft= input.next();

        while (!(antiTheft.equalsIgnoreCase("yes") ||antiTheft.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer. Please re-answer again");

        }
if(age < 25){
    liability+=90;
}else{
    liability +=50;
}


    }
}
