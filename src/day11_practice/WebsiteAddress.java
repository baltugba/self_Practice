package day11_practice;

import java.util.Scanner;

public class WebsiteAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of website:");
        String web= input.next();

       // String web = new Scanner(System.in).next();

        if(web.startsWith("www.")&& web.endsWith(".com")||web.endsWith(".edu")|| web.endsWith(".gov")){
            System.out.println("Valid website");
        }else{
            System.out.println("invalid website");
        }


input.close();



        /*
        Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
         */
    }
}
