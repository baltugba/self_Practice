package day23_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5};
                ArrayList<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(2);
                list.add(3);
                list.add(4);
                list.add(5);
                System.out.println(list);
                list.set(4,0);
                System.out.println(list);
                //[1, 2, 3, 4, 0]
            }
        }
/*
 write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,0];
 */


