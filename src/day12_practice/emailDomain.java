package day12_practice;

public class emailDomain {
    public static void main(String[] args) {

emailDomain("tt_bal@hotmail.com");
emailDomain("tavada.balik@yahoo.com");

    }

public static void emailDomain(String email){
      //  String email ="Cydeo@gmail.com";

        String domain= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
    System.out.println(domain);




}
    /*
    1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
     */
}
