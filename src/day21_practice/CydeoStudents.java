package day21_practice;

import java.util.Arrays;

public class CydeoStudents {
    public static void main(String[] args) {

        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String[][] batch1Groups={batch1Group1,batch1Group2,batch1Group3};
        System.out.println(batch1Groups.length);//3

        batch1Groups[0] = batch1Group1; //assign batch groups to array index
        batch1Groups[1] = batch1Group2;
        batch1Groups[2] = batch1Group3;

        System.out.println(Arrays.deepToString(batch1Groups));
//Ahmet, Baturay, Beyza, Dilara, Muhtar], [Entisar, Ermek, Esmira, Gadir, Hrvoje, Igor, Muhtar], [Kramer, Lorraine, Lucy, Madina, Yasin, Muhtar]]

        System.out.println("_____________________________________________________________");

        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch24Groups = {batch1Group1,batch1Group2,batch2Group3};
        System.out.println(batch24Groups.length); //3

        batch24Groups[0] = batch2Group1;
        batch24Groups[1] = batch2Group2;
        batch24Groups[2] = batch2Group3;
        System.out.println(Arrays.deepToString(batch24Groups));

        System.out.println("____________________________________________________________");

        String[][][] cydeoStudent = {batch1Groups,batch24Groups}; //declare 3D array variable students lenght 2

        cydeoStudent[0] = batch1Groups;
        cydeoStudent[1] = batch24Groups;
        System.out.println(Arrays.deepToString(cydeoStudent));

        for (String[][] each2D :cydeoStudent){ // loop to get each2D array from students
            for(String[]each1D :each2D){        //get each D1 from 2D
                for (String eachElement :each1D){ //    GET EACH ELEMENT FROM 1d
                    System.out.println(eachElement); //PRINT EACH
                }
            }
        }








    }
}
/*
	1. given the following arrays:
		 		String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
		 		String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
		 		String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

		2. declare an array variable named batch1Groups with the length of three
				2.1 Assign batch1Group1, batch1Group2, batch1Group1 to each indexes
				 of the variable batch1Groups

		3. given the following arrays:
				String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch2Group1, batch2Group2, batch2Group1 to each indexes of the variable batch2Groups

		5. declare an array variable named CydeoStudents and assign batch1Groups & batch2Groups to the indexes of CydeoStudents

		6. Print the names of each students
 */