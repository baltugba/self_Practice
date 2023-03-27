package day12_practice;

public class Capitalization {

    public static void main(String[] args) {
capitalization("tuGba ","baL");
capitalization("emRE" , "baL");

    }

public static void capitalization(String firstName,String lastName){

     //   String firstName= "cyDeO";
     //   String lastName="sCHooL";

    firstName   = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
    lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
    System.out.println("Full name:" + firstName +" " +lastName);
}


    /*
     Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
     */

}
