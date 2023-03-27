package day16_practice;

public class FrequencyOfCharacterBunaCalis {
    public static void main(String[] args) {


        String str = "aabccdeef";
        String result = "";

        for (int i = 0; i < str.length(); i++) { //outer loop bir tane char i secer index numarsina gore
            int count = 0;
            for (int j = 0; j < str.length(); j++) { //inner loop char ise,  i index deki char ile karsilastirir hepsini

                if (str.charAt(j) == str.charAt(i)) { //eger esit ise count 1 artar
                    count++;

                }

            }
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i) + "" + count; // toplamini sifirlanmadan eklememiz lazim
            }

        }
        System.out.println("result = " + result);
    }
}


/*

9. Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */