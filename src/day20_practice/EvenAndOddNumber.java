package day20_practice;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6,7,8,9,10,11,12};
        int even = 0;
        int odd=0;

        for (int each : a){
            if(each %2==0){
                even++;
            }else{
                odd++;
            }
            System.out.println("even numbers = " + even);
            System.out.println("odd numbers = " + odd);
        }

    }
}
/*

2.  Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */