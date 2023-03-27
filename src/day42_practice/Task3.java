package day42_practice;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));

        // 3.1 Display the names of the employee who were hired before 2015
        //                    Hint: You can use isBefore method of LocalDate

        for (Map.Entry<String, LocalDate> each : map.entrySet()) {
            if(each.getValue().isBefore(LocalDate.of(2015,1,1))){
                System.out.println(each.getKey());
                //Antony
                //Jimmy
                //Anderson
            }

        }
        System.out.println("__________________________________________________");

        // 3.2 Display the name of the employee who were hired on 5/15/2020
        //                    Hint: You can use isEqual method of LocalDate

        for (Map.Entry<String, LocalDate> each : map.entrySet()) {
            if(each.getValue().isEqual(LocalDate.of(2020,5,15))){
                System.out.println(each.getKey());
                //josh
            }

        }
        System.out.println("______________________________________________");

        // 3.3 How many people were hired after 2014?
        //                    Hint: You can use isAfter method of LocalDate

        int count = 0;

        for (Map.Entry<String, LocalDate> each : map.entrySet()) {
            if(each.getValue().isAfter(LocalDate.of(2014,12,31))){
                count++;
            }

        }
        System.out.println(count+ " people is hired after 2014");//5

        System.out.println("_______________________________________________");

        // 3.4 Display the name and hire date of the employee

        for (Map.Entry<String, LocalDate> each : map.entrySet()) {
            System.out.println((each.getKey()+" : "+each.getValue()));
            //John : 2018-09-05
            //Antony : 2012-07-29
            //Jimmy : 2014-04-01
            //James : 2016-11-02
            //Josh : 2020-05-15
            //Cory : 2015-06-19
            //Anderson : 2013-08-24
            //Steven : 2017-10-0

            //or
            System.out.println("__________________________________________");
            map.forEach( (k, v)->{
                System.out.println(k+" : "+ v);
            });

        }
    }
}
