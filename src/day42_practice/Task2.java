package day42_practice;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.Integer.MIN_VALUE;

public class Task2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //   2.1 who has the maximum and minimum salary?

        int max = MIN_VALUE;
        int min= Integer.MAX_VALUE;
        String maxSalary="";
        String minSalary="";

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if(eachEntry.getValue()> max){
                max= eachEntry.getValue();
                maxSalary =eachEntry.getKey();
            }
            if(eachEntry.getValue()<min){
                min= eachEntry.getValue();
                minSalary= eachEntry.getKey();
            }

        }
        System.out.println(maxSalary+ " has maximum salary "+ max);
        System.out.println(minSalary+" has minimum salary "+ min);

        System.out.println("______________________________________________________________");

     //   2.2 how many employees has the salary between 120k ~ 150K?
        int count = 0;
        for (Integer value : map.values()) {
            if(value>=120000 &&  value <= 150000){
                count++;

        }
        }
        System.out.println(count+ " employees salary between 120k~ 150k");

        System.out.println("___________________________________________________");

     //   2.3 display the names of the employees who are making less than 118k?

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if(eachEntry.getValue() <118000){
                System.out.println(eachEntry.getKey());
            }

        }
        System.out.println("_____________________________________________________");

     //   2.4 increase the salary employee by 10K if the current salary of employee is less than 120K

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if(eachEntry.getValue()<120000){
                eachEntry.setValue(eachEntry.getValue()+10000);

            }

        }
        System.out.println(map);

    }
}
