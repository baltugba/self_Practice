package day06_practice;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;


//                        a = 15,b = 10 c = 20  a =15 c=10 b= 20
        boolean aisMedian = (a> b && a < c) || (a > c && a < b);
        /*
         in order for a to be the median number:
                    1. if c is the maximum number & b is the minimum number, then a is the median number
                    2. if b is the maximum number & c is the minimum number, then a is the median number
         */
      //  b=15, a = 20, c = 10,       b= 15,  a = 10, c= 20
        boolean bIsMedian = (b > c && b< a) || (b > a && b < c);

       // in order of b to be the median number:

        boolean cIsMedian = !aisMedian && !bIsMedian;

        if(aisMedian){
            System.out.println(a+ " is the median number");
        }
        if(bIsMedian){
            System.out.println (b + " is the median number");
        }
        if(cIsMedian){
            System.out.println(c + " is the median number");
        }


    }
}
/*
ate a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers
		Ex:
                a = 10, b= 15, c = 20;
            Output:
                15 is the median number
 */