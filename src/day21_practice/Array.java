package day21_practice;

public class Array {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };


        for(String[] each1D :items){
            for(String eachItem : each1D){
                System.out.println(eachItem+ "\t");
            }
            System.out.println();
        }

        System.out.println("________________________________________________________");

        for(String[]each1D : items){
            for (int i = each1D.length-1; i >=0 ; i--) {
                System.out.println(each1D[i] + "\t");

            }
            System.out.println();
        }

        System.out.println("___________________________________________________________");

        for (int i = items.length-1; i >= 0; i--) {
            String[] arr1D = items[i];
            for (String eachItem : arr1D){
                System.out.println(eachItem + "\t");
            }
            System.out.println();

        }

    }
}
/*

2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */