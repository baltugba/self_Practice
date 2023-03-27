package day08_practice;

public class Browser {
    public static void main(String[] args) {

        String browserName= "";
int num= 5;

        switch (num){
            case 1:
                System.out.println("Chrome");
                break;
            case 2:
                System.out.println("Firefox");
                break;
            case 3:
                System.out.println("opera");
                break;
            case 4:
                System.out.println("safari");
                break;
            case 5:
                System.out.println("edge");
                break;
            default:
                System.out.println("Invalid Browser");



        }





        /*

9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
         */
    }
}
