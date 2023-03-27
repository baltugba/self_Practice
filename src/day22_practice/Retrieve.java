package day22_practice;

public class Retrieve {
    public static void main(String[] args) {
        String str = "Wooden Spoon!";
        String letters="";
        String digits = "";
        String specialCharacters="";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                letters +=str.charAt(i);
            }
            if(Character.isDigit(str.charAt(i))){
                digits += str.charAt(i);
            }
            if(!Character.isLetterOrDigit(str.charAt(i))){
                specialCharacters +=str.charAt(i);
            }

        }
        System.out.println("specialCharacters = " + specialCharacters);
        System.out.println("Digits = " + digits);
        System.out.println("letters = " + letters);
    }
}
/*
. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods
 */