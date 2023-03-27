package day26_practice.Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public static void main(String[] args) {
       Restaurant rest1 = new Restaurant("Tugba Bal","Atlanta",5);
        System.out.println(rest1);
        Server s1=new Server("Defne",10,15,true, LocalDate.of(2022,2,2));


    }

    public String owner,location;
    public int numberOfStars;
    public ArrayList<Server> serverList= new ArrayList<>();
    public ArrayList<Chef> chefList = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }
    public void hireServer(Server server){
        serverList.add(server);
    }
    public void hireServer(Server[]servers){
        serverList.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        chefList.add(chef);
    }
    public void hireChef(Chef[] chefs){
        chefList.addAll(Arrays.asList(chefs));
    }
    public void terminateChef(int employeeID){
        chefList.removeIf(p->p.employeeID== p.employeeID);
    }
    public void terminateSever(int employeeID){
        serverList.removeIf(p->p.employeeID==employeeID);
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ",serverList="+ serverList+
                ",chefList="+ chefList+
                '}';
    }
}
/*
            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

	                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList

	                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

	                terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef

	                terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

	                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information
 */