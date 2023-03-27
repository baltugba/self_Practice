package day28_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        ArrayList<Candy> candies = new ArrayList<>(Arrays.asList(
        new Candy("tadalle",2,3,false),
        new Candy("Milka",1,2,false),
        new Candy("Nutella",1,10,false),
        new Candy("Milka",5,4,false),
        new Candy("snikers",5,4,true)));

        for (Candy each:candies){
            System.out.println(each.getBrand() + ":"+each.getPrice());
        }

     //   tadalle:3.0
      //  Milka:2.0
      //  Nutella:10.0
      //  Milka:4.0
      //  snikers:4.0


     /*   list.addAll(Arrays.asList
     (new Candy("Milka",2,5,false),
      new Candy("Snikers",1,2,true),
      new Candy("Nutella",1,10,false),
      new Candy("Tadelle",5,3,false),
      new Candy("Milka",6,4,false)));

        System.out.println(Arrays.asList(list));
*/

    }
}
