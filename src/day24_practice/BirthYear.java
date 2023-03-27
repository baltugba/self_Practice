package day24_practice;

import java.time.LocalDate;

public class BirthYear {
    public static void main(String[] args) {
        LocalDate birthYear = LocalDate.of(1983,2,2);
        boolean isLeapYear = birthYear.isLeapYear();
        System.out.println(isLeapYear);



    }
}
/*

8. Create a function that accepts an int argument birthYear,
 return true if the person was born on leap year, otherwise return false
 */