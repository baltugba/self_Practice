package day06_practice;

public class PosNegZero {
    public static void main(String[] args) {

        int n = 20;
        String result = "";

        if(n<0){
            result= "  negative";
        }
        if(n>0){
            result =  "  positive";
        }
        if(n==0){
            result =  " zero";


    }
        System.out.println(result);
    }


}
