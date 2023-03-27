package day23_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
      String[] names = {"John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"};

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(names));

        list.removeAll(Arrays.asList("Ahmed"));
        System.out.println(list);

    }
}
/*

3. Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];
 */