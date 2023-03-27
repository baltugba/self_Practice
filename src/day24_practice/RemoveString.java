package day24_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveString {
    public static void main(String[] args) {
        String[] names  = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        list.removeIf(p-> p.toUpperCase().charAt(0) == p.toUpperCase().charAt(p.length()-1));

        System.out.println(list);


    }
}
/*
 Write a program that can remove string elements from an arraylist if the firt and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Lan", "Ebrahim", "Farida"]
 */