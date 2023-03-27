package day18_practice;

public class highestFrequency {
    public static void main(String[] args) {
        String str="aaabbccccddeeee";
        String result="";
        int max=0;
        for (int i = 0; i < str.length(); i++) {
            int frequency=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)==str.charAt(i)){
                    frequency++;

                }
                if(frequency>max){
                    max=frequency;
                }


            }

        }
        for (int i = 0; i <str.length() ; i++) {
            int frequency=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)==str.charAt(i)){
                    frequency++;
                }
             if(max==frequency && !result.contains("" + str.charAt(i))) {
                 result+=""+str.charAt(i);
             }
            }

        }
        System.out.println(result);
    }



}
/*
 Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
 */