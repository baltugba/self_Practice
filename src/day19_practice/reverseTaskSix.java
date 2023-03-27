package day19_practice;

import java.util.Arrays;

public class reverseTaskSix {
    public static void main(String[] args) {

        int[]array={1,2,3,4,5};
        int[]reverse= new int[array.length];


        for (int i = array.length-1; i >=0;i--) {
           reverse[i]=array[array.length-i-1];

            }
        System.out.println(Arrays.toString(reverse));


        }
    }





/*

6.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */