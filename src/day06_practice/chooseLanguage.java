package day06_practice;

public class chooseLanguage {

    public static void main(String[] args) {

int number = 3;
String selection = "";

if(number ==1){
    selection = "Hello, thank for your call";

}
if (number == 2){
    selection = " Hola, gracias para llamar";
}
if (number==3){
    selection= "Merhaba, aradiginiz icin tesekkurler";
}
if(number==4){
    selection= "Privet, spasibo za vash zvonok";
}
if(number==5){
    selection="Merci ,pour votre appel";
}

        System.out.println(selection);
    }
}
/*

create a class named ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement
 */