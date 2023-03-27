package day14_practice;

public class Palindrome {


    public static void main(String[] args) {

      String str = "kabak" ;
      String reverse="";
      for (int i =str.length()-1; i>=0;i--){  //kelimeyi tersten okur
        reverse+=str.charAt(i)  ;
      }
      boolean isPalindrome=str.equalsIgnoreCase(reverse);
        System.out.println(isPalindrome);




        /*
         Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
         */
    }
}
