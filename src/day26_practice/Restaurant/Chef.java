package day26_practice.Restaurant;

public class Chef {
    public static void main(String[] args) {

        Chef chef1 = new Chef("Tugba",6666,25,true);
        System.out.println(chef1);

        chef1.washDishes();
        chef1.makeOrder();
    }

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }
    public void makeOrder(){
        System.out.println(name+ " is making an order");
    }
    public void washDishes(){
        System.out.println(name+ " is washing the dishes");
    }
    public String isFullTime(){
        if(fullTime==true){
            return "fullTime";
        }else{
            return "partTime";
        }


    }

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
/*
Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

			   Add A constructor that can set all the fields

		            Actions: (all void methods)
		                makeOrder(): chef's name + "is making an order"
		                washDishes(): chef's name + "is washing the dishes"
		                toString(): Returns (String) all the information of a Chef
		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
 */