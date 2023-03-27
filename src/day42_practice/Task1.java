package day42_practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        int[] student1 = {65, 85, 95, 90,100};
        int[] student2 = {55, 95, 25, 95,70};
        int[] student3 = {80, 85, 95, 90,40};
        int[] student4 = {65, 65, 75, 60,50};
        int[] student5 = {65, 85, 45, 70,90};

        Map<String, int[]> map= new LinkedHashMap<>();
        map.put("Tugba",student1);
        map.put("Emre",student2);
        map.put("Defne",student3);
        map.put("Tayfun",student4);
        map.put("Duman",student5);


        for (Map.Entry<String, int[]> eachEntry : map.entrySet()) {// get each entry
            System.out.println(eachEntry.getKey()+":"+ Arrays.toString(eachEntry.getValue()));

        }
        /*
        Tugba:[65, 85, 95, 90, 100]
Emre:[55, 95, 25, 95, 70]
Defne:[80, 85, 95, 90, 40]
Tayfun:[65, 65, 75, 60, 50]
Duman:[65, 85, 45, 70, 90]
         */


    }
}
