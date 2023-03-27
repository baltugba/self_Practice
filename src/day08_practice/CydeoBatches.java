package day08_practice;

public class CydeoBatches {
    public static void main(String[] args) {
        //Switch
        String batch = "UsMorning";
        String result="";

        switch (batch) {
            case "UsMorning":
                System.out.println("Class times are 10-5 EST. M, T,Th,F.");
                break;
            case "USAfternoon":
                System.out.println("Class times are 7-10 EST. M,T,Th,S,S");
                break;
            case "EU":
                System.out.println("Class times are 10-5 EST. M,T,W,Th,F.");
            default:
                System.out.println("Invalid Btach");

                System.out.println("................................");

                // if statement


                if (batch == "Us Morning") {
                    result = ("Class times are 10-5 EST. M,T,Th,F");

                } else if (batch == "Us Evening") {
                    result = (" Class times are 7-10EST. M,T,W,Th,S,S");
                } else if (batch == "EU") {
                    result = ("Class times are 10-5 EST. M,T,W,Th,F.");

                } else {
                    result = (" Invalid Batch");
                }
                System.out.println(result);


                System.out.println(".................................");

//if&switch statement


                if (batch == "Us Morning" || batch == "Us Evening" || batch == "EU") {
                    switch (batch) {
                        case "Us Morning":
                            result = "Class times are 10-5 EST. M, T, Th, F. ";
                            break;
                        case "Us Evening":
                            result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                            break;
                        case "EU":
                            result = "Class times are  10-5 EST. M, T, W, Th, F.";
                            break;
                    }
                    }else{
                        result = "Invalid Batch";
                    }

                    System.out.println(result);

                }


        }










        /*


10. Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

         */
    }

