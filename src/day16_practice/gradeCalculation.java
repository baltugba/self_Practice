package day16_practice;

import java.util.Scanner;

public class gradeCalculation {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        while(true){
            System.out.println("Enter your score");
            int score= input.nextInt();

            while (score<0 ||score >100){
                System.err.println("Invalid entry! Please re-enter again");
                String answer= input.next();
                System.exit(1);
            }
            if(score>=90 && score<=100){
                System.out.println("Your grade is A");
            }else if(score>=80 && score<=89){
                System.out.println("Your grade is B");
            }else if(score>=70 && score <=79){
                System.out.println("Your grade is C");
            }else if(score >=60 && score <=69){
                System.out.println("Your grade is D");
            }else{
                System.out.println("Your grade is F");
            }
            System.out.println("Would you like to continue?Yes/No");
            String answer=input.next();

            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid entry! Please re-enter again");
                answer=input.next();
            }
            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                System.exit(1);
            }
        }

    }
}
/*

7. Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program
 */