package day08_practice;

public class AgeGroups {
    public static void main(String[] args) {

int ageGroup= 6;

String result= (ageGroup>=1 && ageGroup<=2)?"Infant" :(ageGroup>=3&&ageGroup<=5)?"Toddler"
        :(ageGroup>=6 && ageGroup<=9)?"Kid":(ageGroup>=10 && ageGroup<=12)?"Pre-Teen"
        :(ageGroup>=13 && ageGroup<=17)?"Teenager":(ageGroup>=18 && ageGroup<=20)?"Young Adult"
        :(ageGroup>=21 && ageGroup<=39)?"Adult":(ageGroup>=40 && ageGroup<=49)?"Young Middle-Aged Adult"
        :(ageGroup>=50 && ageGroup<=54)?"  Middle-Aged Adult":(ageGroup>=55 && ageGroup<=64)?"Very Young Senior Citizen "
        :(ageGroup>=65 && ageGroup<=74)?"Young Senior Citizen ":(ageGroup>=75 && ageGroup<=84)?"Senior Citizen":" Old Senior Citizen";

        System.out.println(result);

        // +switch statement






        /*
        reate a class called AgeGroups
		write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

        Note: MUST use ternary
         */

    }
}
