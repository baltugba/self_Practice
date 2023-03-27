package day22_practice;

public class UpperLowerCaseTask6 {
    public static void main(String[] args) {
       String str = "JAVA java";

       boolean isTrue = true;

       char[] ch =str.toCharArray();
       int upperCase = 0;
       int lowerCase = 0;

       for (char each:ch){
           if(Character.isUpperCase(each)){
               upperCase++;
           }
       }
       for (char each: ch){
           if(Character.isLowerCase(each)){
               lowerCase++;
           }
       }
       if(upperCase==lowerCase){
           System.out.println(true);

       }else {
           System.out.println(false);
        }

    }
}
/*
rite program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods
 */