package day22_practice;

import java.util.ArrayList;

public class Combine {
    public static void main(String[] args) {

       String[] arr1 = {"A", "B", "C"};
        String[] rr2 = {"D", "E", "F", "G"};
        ArrayList<String> list = new ArrayList<>();

        for (String each: arr1){
            list.add(each);
        }
        for (String each: rr2){
            list.add(each);
        }
        System.out.println(list);

    }
}
/*
 write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */