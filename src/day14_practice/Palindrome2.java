package day14_practice;

public class Palindrome2 {
    public static void main(String[] args) {
        String t ="tugba";
        String result ="";
        for(int i=0; i<t.length();i++){
            boolean isTrue=t.substring(0,1).equalsIgnoreCase(t.substring(t.length()-1));
            if(isTrue){
                result="True";
            }else{
                result="False";
            }
            System.out.println(result);
        }
    }
}
