package day23_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class largestNumberOlmadi {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

       // Collections.sort(list);
      //  System.out.println(list);

        ArrayList<Integer>nonDup = new ArrayList<>();
        for (Integer each: list){
            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }
        System.out.println(nonDup);
        System.out.println(nonDup.get(nonDup.size()-5));


    }
}
/*

5. write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */