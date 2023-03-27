package day42_practice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Map<String, Object> car1 = new Hashtable<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 55000);
        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        //(Create 3 more map objects and store 3 different car informations in them)

        Map<String,Object> car4 = new Hashtable<>();
        car4.put("brand","Mercedes");
        car4.put("model","A180");
        car4.put("color","Gray");
        car4.put("year",2022);
        car4.put("price",90000);
        car4.put("electric", false);

        Map<String,Object> car5 = new Hashtable<>();
        car5.put("brand","Honda");
        car5.put("model","Pilot");
        car5.put("color","Gray");
        car5.put("year",2022);
        car5.put("price",70000);
        car5.put("electric", false);

        Map<String,Object> car6 = new Hashtable<>();
        car6.put("brand","Toyota");
        car6.put("model","Corolla");
        car6.put("color","Black");
        car6.put("year",2021);
        car6.put("price",50000);
        car6.put("electric", false);


        System.out.println("________________________________________");

        // 4.1 Create a map named myCars that takes car number as a key and car info as a value
        //        		Hint: key of the map need to be integer and value of the map need to be a map with String as key and Object as value

        Map<Integer, Map<String, Object>> myCars = new LinkedHashMap<>();

        myCars.put(1,car1);
        myCars.put(2,car2);
        myCars.put(3,car3);
        myCars.put(4,car4);
        myCars.put(5,car5);
        myCars.put(6,car6);
        System.out.println(myCars);

        System.out.println("_______________________________________________");

        //4.2 Display the brand-model-price of each car

        for (Map<String, Object> value : myCars.values()) {
            System.out.println(value.get("brand")+" "+ value.get("model")+" "+ value.get("price"));

        }
        System.out.println("________________________________________________");

        //4.3 Display all the electric cars

        for (Map<String, Object> value : myCars.values()) {
            if (value.get("electric").equals(true)){
                System.out.println(value.get("brand")+" "+ value.get("model"));//Tesla Model Y
            }

        }
        System.out.println("____________________________________________________________");

        //4.4 Display the most expensive car

        int maxPrice = Integer.MIN_VALUE;
        String mostExpensiveCar = "";


        for (Map<String, Object> eachValue : myCars.values()) {
            if( ((Integer)  eachValue.get("price")) > maxPrice){
                maxPrice = ((Integer)  eachValue.get("price"));
             //   System.out.println(maxPrice);
                mostExpensiveCar = (String)(eachValue.get("brand") + " " + (String)eachValue.get("model") +
                        " is the most expensive car" + " : " + maxPrice);
            }
        }

        System.out.println(mostExpensiveCar);
}}
/*
 int max = MIN_VALUE;
        int min= Integer.MAX_VALUE;
        String maxSalary="";
        String minSalary="";

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if(eachEntry.getValue()> max){
                max= eachEntry.getValue();
                maxSalary =eachEntry.getKey();
            }
 */