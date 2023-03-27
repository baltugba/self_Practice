package day24_practice;
import java.util.ArrayList;
import java.util.Arrays;

public class countryNames {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Turkiye", "Canada", "United States", "England", "Italy", "France", "Guatemala", "Papua New Guinea"));

        list.removeIf(p -> p.length() >= 10);
        System.out.println(list);
    }
    }

/*

6.
Create an ArrayList of string called country names,
write a program that can remove all the country names that have length of 10 or greater

 */