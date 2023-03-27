package day04_practice;

import java.util.SortedMap;

public class SwapToVariables {
    public static void main(String[] args) {
int x = 10;
int y = 15;
int z = 0;

z=x;
x=y;
y=z;

        System.out.println("x="+x+"\n"+ "y="+y);


    }
}
/*


    8.1 Write a program that swap variables x & y’ values by using a temporary variable z
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 20
 */