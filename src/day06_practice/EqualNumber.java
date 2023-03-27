package day06_practice;

public class EqualNumber {
    public static void main(String[] args) {
    int n1 = 10,
    n2= 11,
    n3 = 15;
    String result = "";

    if(n1==n2 && n1!=n3){
        result = "n1&n2 are equal";
    }
    if(n1==n2 && n2==n3) {
        result = "all equal";

    }
    if(n2==n3 && n2 != n1 ){
        result ="n2&n3 are equal";
    }
    if(n1==n3 && n1 != n2){
        result = "n1&n3 are equal";

    }
    if(n1!=n2 && n2!=n3 && n3 !=n1){
        result = "none of them are equal";

    }

        System.out.println(result);
    }
}
