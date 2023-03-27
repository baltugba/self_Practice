package day22_practice;

import java.util.Arrays;

public class InsertOlmadi {
    public static void main(String[] args) {
        int[]arr = {10, 20, 30, 40, 50};

        int[] newArray=insert(arr,2,100);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] insert(int[] array, int index,int element){
        for (int i = 0; i < array.length; i++) {
            array[index]=element;

        }
        return array;

    }
    public static double[] insert(double[] array,int index,double element){
        for (int i = 0; i < array.length; i++) {
            array[index]= element;
            

        }
        return array;
    }
    public static char[] insert(char[] array, int index,char element){
        for (int i = 0; i < array.length; i++) {
            array[index]=element;

        }
        return array;
    }
    public static String[] insert(String[] array,int index,String element){
        for (int i = 0; i < array.length; i++) {
            array[index]=element;

        }
        return array;
    }
}
/*
 Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array
 */