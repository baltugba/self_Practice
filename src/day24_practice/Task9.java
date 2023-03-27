package day24_practice;

import java.time.LocalDate;
import java.util.ArrayList;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<LocalDate> localDate = new ArrayList<>();
        localDate.add(LocalDate.of(1983,1,31));
        localDate.add(LocalDate.of(1975,5,25));
        localDate.add(LocalDate.of(2007,4,21));
        localDate.add(LocalDate.of(2017,3,6));

        localDate.removeIf(p->p.isBefore(LocalDate.of(2016,8,15)));
        System.out.println(localDate);






    }
}
/*

9. create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
 */