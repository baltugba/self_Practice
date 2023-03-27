package day12_practice;

public class daysInMonth {

    public static void main(String[] args) {

numberOfDays("January");
numberOfDays("April");
numberOfDays("march");
numberOfDays("september");

    }
public static void numberOfDays(String month){
        month=(""+month.charAt(0)).toUpperCase()+month.substring(1);

    String result= month+ " has ";
    switch (month){
        case " February ":
            month +=28 + " days";
            break;
        case "April":
        case "June":
        case "September":
        case "November":
            month += 30 + " days";
            break;
        case "January":
        case "March":
        case "July":
        case "August":
        case "October":
        case "December":
            month += 31 +" days";
            break;
        default:
            month = "Invalid month";

    }
    System.out.println(month);
}




}


    /*

5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
     */

