package day26_practice.Restaurant;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Server {

    public static void main(String[] args) {

        Server server1 = new Server("Tugba",123,20,true,LocalDate.of(2022,5,5));
        System.out.println(server1);

        server1.cleanTable();
        server1.takeOrder();

        System.out.println(server1.fullTime);

    }
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;
    public LocalDate hire_date;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.hire_date = hire_date;



    }
    public void takeOrder(){
        System.out.println(name+ " is taking an order");
    }
    public void cleanTable(){
        System.out.println(name + " is cleaning table");
    }
    public String isFullOrPartTime(){
        String result = "partTime";
        if(this.fullTime==true){
            result = "fullTime";
        }
        return result;

    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                ", hire_date=" + hire_date.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                '}';
    }
}
/*
.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean), hire_date (LocalDate)

			Add A constructor that can set all the fields

	        Actions: (all void methods)
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
 */