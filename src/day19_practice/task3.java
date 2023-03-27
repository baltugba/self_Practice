package day19_practice;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

      //  String itemsToString =Arrays.toString(items);

        System.out.println(items[2].indexOf('G'));  //0

        boolean result= Arrays.toString(items).contains("iPad"); //true
        System.out.println(result);


        for (int i = 0; i < items.length; i++) {
      //  for (int i = 0,j=0,k=0; i < items.length; i++,j++,k++) {
            System.out.println(items[i] +"--"+ prices[i] +"--"+itemIDs[i] );
        }


        }

    }


/*
Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID


 */