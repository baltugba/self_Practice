package day36_practice;


import day34_practice.carTask.*;

import java.util.ArrayList;

public class CarTask {
    public static void main(String[] args) {
        Car[] cars = {
                new Honda("Pilot",2010,25000,"White"),
                new Audi("Q6", 2010,32000,"Red"),
                new Honda("Accord", 2011,20000, "White" ),
                new Audi("Q4", 2015, 33000, "Blue"),
                new Audi("A7", 2019,35000, "Black"),
                new Audi("Q8", 2018,40000 ,"White"),
                new Audi("Q5", 2009,30000, "Purple"),
                new Audi("A4", 2011, 30000, "Black"),
                new Honda("Civic", 2018,30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V",2019 ,35000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "White"),
                new Tesla("Model Y", 2017, 65000, "Black"),
                new Tesla("Model X", 2016, 48000, "White"),
                new Tesla("Model X", 2014,48000, "Blue"),
        };
/*
        Write a program that can display all the cars that are eligible for recall

        Cars that are eligible for recall:
        Honda: from year 2010 to 2011
        Audi: from year 2015 to 2019
        Tesla: from year 2015-2016
*/
        for (Car each:cars){
            if(each instanceof Honda){
                if(each.getYear() >=2010 && each.getYear()<=2011){
                    System.out.println("Eligible for recall" + each);
                }
            }
            if(each instanceof Audi){
                if(each.getYear()>=2015 && each.getYear()<=2019){
                    System.out.println("Eligible for recall = " + each);
                }
            }
            if(each instanceof Tesla){
                if(each.getYear()>=2015 && each.getYear()<=2016){
                    System.out.println("Eligible for recall = " + each);
                }
            }
        }

        System.out.println("__________________________________________________");

     //   1.3 Write a program that can display the car that has the highest price

     //   1.3 Write a program that can display the car that has the lowest price


        System.out.println("_____________________________________________");
/*
        Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
        ArrayList<Tesla> teslaCars = new ArrayList<>()

*/
        ArrayList<Tesla> teslaCars = new ArrayList<>();
        for (Car each: cars){
            if(each instanceof Tesla){
                teslaCars.add( (Tesla)each);
            }
        }
        System.out.println(teslaCars);
        double highestPrice = cars[0].getPrice();
        double lowestPrice = cars[0].getPrice();
        String highPriceCarName="";
        String lowePriceCarName="";

        for(Car each:cars){
            if(each.getPrice()>highestPrice){
                highestPrice= each.getPrice();
                highPriceCarName=each.getMake();

            }

        }
        for(Car each:cars){
            if(each.getPrice()<lowestPrice){
                lowestPrice= each.getPrice();
                lowePriceCarName=each.getMake();
            }

        }
        System.out.println("____________________________");
        System.out.println("Highest price car "+ highPriceCarName+ ":"+highestPrice);
        System.out.println("Lowest car price "+ lowePriceCarName+":"+ lowestPrice);


        ArrayList<Honda>hondaCars  = new ArrayList<>();
        for(Car each:cars){
            if(each instanceof Honda){
                hondaCars.add((Honda)each);
            }
        }
        System.out.println(hondaCars);

        System.out.println("__________________________________________");

        ArrayList<Audi> auidiCars = new ArrayList<>();
        for(Car each:cars){
            if(each instanceof Audi){
                auidiCars.add((Audi) each);
            }
        }
        System.out.println(auidiCars);

    }


        }


