package day36_practice;



import day35_practice.Developer;
import day35_practice.Driver;
import day35_practice.Teacher;
import day35_practice.Tester;

import java.util.ArrayList;

public class Employee {
    public static void main(String[] args) {

day35_practice.Employee[] employees = {
        new day35_practice.Tester("Hamza", 32, 'M', "A01", "QA", 110000),
        new day35_practice.Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
        new day35_practice.Tester("George", 28, 'M', "A03", "SDET", 120000),
        new day35_practice.Developer("Yulia", 23, 'F', "A04", "Software Developer", 135000, "Python"),
        new day35_practice.Tester("Cihad", 30, 'M', "A05", "SDET", 105000),
        new day35_practice.Developer("Gulistan", 26, 'F', "A06", "Web Developer", 130000, "Python"),
        new day35_practice.Tester("Nora", 28, 'F', "A07", "QE", 120000),
        new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
        new Driver("Bella", 32, 'F', "D12", "Truck Driver", 95000),
        new day35_practice.Developer("Diana", 29, 'F', "A08", "Front-end Developer", 140000, "C#"),
        new day35_practice.Tester("Tatiana", 25, 'F', "A09", "SDET", 130000),
        new day35_practice.Developer("Alena", 26, 'F', "A10", "Back-end Developer", 150000, "Java"),
        new day35_practice.Tester("Timur", 29, 'M', "A11", "SDET", 115000),
        new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000),
        new day35_practice.Developer("Hasan", 26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
        new day35_practice.Tester("Nataliia", 24, 'F', "A13", "QE", 125000),
        new day35_practice.Developer("Ermek", 26, 'M', "A14", "Full Stack Developer", 142000, "Java"),
        new day35_practice.Tester("Khashayar", 30, 'M', "A15", "SDET", 105000),
        new Teacher("Conor", 35, 'M', "B2", "Physics Teacher", 85000),
};

        /*
        2.1 store all the developers & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();
         */

        ArrayList<day35_practice.Employee> scrumMembers = new ArrayList<>();
        ArrayList<day35_practice.Tester> testers = new ArrayList<>();
        ArrayList<day35_practice.Developer> developers=new ArrayList<>();

        for(day35_practice.Employee each : employees){
            if(each instanceof day35_practice.Tester || each instanceof day35_practice.Developer){
                scrumMembers.add(each);
            }
            if(each instanceof day35_practice.Tester){
                testers.add( (day35_practice.Tester) each);
            }
            if(each instanceof day35_practice.Developer){
                developers.add( (day35_practice.Developer) each);
            }
        }
        double maxSalary = 0;
        String employeeName="";

        for(Tester each : testers){
            if(each.getSalary() > maxSalary) {
                maxSalary= each.getSalary();
                employeeName=each.getName();
            }
        }
        System.out.println(employeeName +":" + maxSalary);

        maxSalary = 0;
        employeeName="";

        for(Developer each : developers){
            if(each.getSalary() >maxSalary){
                maxSalary = each.getSalary();
                employeeName= each.getName();
            }
        }
        System.out.println(employeeName+":"+maxSalary);




        // System.out.println("scrumMembers = " + scrumMembers);
        // System.out.println("developers = " + developers);
        // System.out.println("testers = " + testers);

       /*
         which tester has the maximum salary?
         which developer has the maximum salary?
        */



        // double maxsalary2= employees[0].getSalary();
        // String developerName = "";





    }


}




