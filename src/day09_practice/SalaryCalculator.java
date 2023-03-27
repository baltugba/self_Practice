package day09_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your hourly rate:");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours you work in a week:");
        int weeklyHours =  input.nextInt();

        System.out.println("Enter your state tax rate(in percentage)");
        double stateTaxRate= input.nextDouble() /100;

        System.out.println("Enter your FederalTaxRate (in percentage)");
        double FederalTaxRate = input.nextDouble() /100;

        double salary = hourlyRate*weeklyHours*52;
        double stateTax = salary* stateTaxRate;
        double federalTax = salary* FederalTaxRate;
        double totalTax= stateTax+federalTax;
        double netIncome = salary-totalTax;

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("netIncome = " + netIncome);

        input.close();










        /*
         Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
         */


    }
}
