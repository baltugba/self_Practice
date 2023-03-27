package day25_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {
      Offer offer1 = new Offer("Atlanta","Target","SDET",80000,true,true,true,true);
      Offer offer2 = new Offer("New York","Amazon","QA Engineer",150000,true,true,false,true);
      Offer offer3 = new Offer("Miami","Google","SDET",160000,true,true,false,true);
      Offer offer4 = new Offer("Atlanta","Siemens","QA Engineer",120000,true,false,false,false);
      Offer offer5 = new Offer("LA","Bosh","Developer",165000,true,true,false,false);
      Offer offer6 = new Offer("Boston","Primetals","Developer",145000,false,false,false,true);
      Offer offer7 = new Offer("Atlanta","Walmart","QA Engineer",85000,true,true,false,false);


      Offer[] myOffers ={offer1,offer2,offer3,offer4,offer5,offer6,offer7};
      System.out.println("____________________________________________________________");


        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p->!p.isFullTime);
      System.out.println(fullTimeOffers);
      System.out.println("____________________________________________________________");



      ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
      localOffers.removeIf(p->!p.location.equalsIgnoreCase("Atlanta"));
      System.out.println(localOffers);
      System.out.println("____________________________________________________________");

      ArrayList<Offer> OffersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
      OffersWithBenefits.removeIf(p->!p.hasBenefit&&p.hasPTO);
      System.out.println(OffersWithBenefits);
      System.out.println("____________________________________________________________");

      ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(myOffers));
      devOffers.removeIf(p->!p.jobTitle.equalsIgnoreCase("Developer"));
      System.out.println(devOffers);
      System.out.println("____________________________________________________________");

      ArrayList<Offer> With100K = new ArrayList<>(Arrays.asList(myOffers));
      With100K.removeIf(p->p.salary<100000);
      System.out.println(With100K);








    }
}
/*
      2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */