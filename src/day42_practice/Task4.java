package day42_practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        // Given the following arrays that contains the names of the students from each group:
        String[] group1 = {"tugba","Emre","Defne"};
        String[] group2 = {"Tayfun","Hasan","Hakan"};
        String[] group3 = {"Ali","Zeynep","Gokhan"};
        String[] group4 = {"Zulfiye","Gokce","Sema"};
        String[] group5 = {"Aysun","Mete","Olcay"};

        //.1 Create a map that contains group id and names of group members

        Map<Integer, String[]> groups = new LinkedHashMap();
        groups.put(1,group1);
        groups.put(2,group2);
        groups.put(3,group3);
        groups.put(4,group4);
        groups.put(5,group5);


        System.out.println("_______________________________________________");
        //4.2 Display the names of each student with group id of 1

        for (Map.Entry<Integer, String[]> each : groups.entrySet()) {
            if(each.getKey()==1){
                System.out.println(Arrays.toString(each.getValue()));
            }

        }

        System.out.println("_______________________________________________");

        // 4.3 Display the names of each student from each groups

        for (Map.Entry<Integer, String[]> each : groups.entrySet()) {
            System.out.println(each.getKey()+" : "+ Arrays.toString(each.getValue()));

        }




    }
}
